/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow; // means slow == fast u can return fast also and this is starting point
            }
        }
        return null;
    }
}


        // HashSet<ListNode> seen = new HashSet<>(); // using hashset tc = O(n + 2 Logn) sc = O(n)
        // ListNode temp = head;
        // while(temp != null){
        //     if(seen.contains(temp)) return temp;
        //     seen.add(temp);
        //     temp = temp.next;
        // }
        // return null;