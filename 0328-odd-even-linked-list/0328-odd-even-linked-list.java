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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = head.next; // we can also take evenHead = even
        while( even != null && even.next != null){
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}
        // if(head == null || head.next == null) return head;
        // ArrayList<Integer> list = new ArrayList<>();
        // ListNode temp = head;
        // while(temp != null && temp.next != null){ // for odd elements
        //     list.add(temp.val);
        //     temp = temp.next.next;
        // }
        // if(temp != null) list.add(temp.val);

        // temp = head.next;
        // while(temp != null && temp.next != null){ // for even elements
        //     list.add(temp.val);
        //     temp = temp.next.next;
        // }
        // if(temp != null) list.add(temp.val);

        // int i=0 ;
        // temp = head;
        // while(temp != null){
        //     temp.val = list.get(i);
        //     i++;
        //     temp = temp.next;
        // }
        // return head;