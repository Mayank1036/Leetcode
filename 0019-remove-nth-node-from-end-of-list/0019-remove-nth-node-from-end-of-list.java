/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        for(int i=0 ;i<n ; i++) fast = fast.next;
        
        if(fast == null) return head.next;

        ListNode slow = head;
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        ListNode deletenode = slow.next;
        slow.next = slow.next.next;
        return head;
    }
}
        // int count = 0; // using brute force approch wth tc = O(len) + O(len - n)
        // ListNode temp = head;
        // while(temp != null){
        //     count++;
        //     temp = temp.next;
        // }
        // if(count == n){
        //     ListNode newHead = head.next;
        //     return newHead;
        // }
        // int res = count - n;
        // temp = head;
        // while(temp != null){
        //     res--;
        //     if(res == 0) break;
        //     temp = temp.next;
        // }
        // ListNode deleteNode = temp.next;
        // temp.next = temp.next.next;
        // return head;