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
    public ListNode middleNode(ListNode head) {
        ListNode slow = head; // most optinal and easy tc , sc = O(n)
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }  
}


        // int len = 0; // finding length of list tc = O(n) and sc = O(1);
        // ListNode temp = head;
        // while(temp != null){
        //     len++;
        //     temp = temp.next;
        // }

        // len = len/2;
        // temp = head;
        // while(len != 0){
        //     temp = temp.next;
        //     len--;
        // }
        // return temp;

    //     ArrayList<ListNode> arr = new ArrayList<>();  // takes extra space to store O(n) converting to arr
    //     ListNode temp = head;
    //     while( temp != null){
    //         arr.add(temp);
    //         temp = temp.next;
    //     }
    //     return arr.get(arr.size() / 2);
    // }