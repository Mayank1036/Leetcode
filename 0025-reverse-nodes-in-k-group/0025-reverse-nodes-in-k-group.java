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

    public ListNode reverseLL(ListNode head){   // Reverse a linked list
        ListNode prev = null;
        ListNode temp = head;
        while(temp != null){
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    public ListNode findKthNode(ListNode temp , int k){
        k--;
        while(temp != null && k>0){
            temp = temp.next;
            k--;
        }
        return temp;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prevLast = null;

        while(temp != null){
            ListNode kthNode = findKthNode(temp , k);
                if(kthNode == null){
                    if(prevLast != null){
                        prevLast.next = temp;
                    }
                    break;
                }
            ListNode nextNode = kthNode.next;
            kthNode.next = null;
            reverseLL(temp);
            if(temp == head){
                head = kthNode;
            }
            else{
                prevLast.next = kthNode;
            }

            temp.next = nextNode;
            prevLast = temp;
            temp = nextNode;
        }
        return head;
    }
}