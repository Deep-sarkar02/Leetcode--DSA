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
        int size = 0;
        ListNode temp = head;
        while(temp != null)
        {
            size++;
            temp = temp.next;
        }
        if (n == size) {
            return head.next;
        }
        //System.out.println(size);


        // from the start of the LL find the n
        //int pos = (size - n +1);
        // now we will remove the node at this pos
        int i = 1;
       ListNode prev = head;
        while(i < size-n)
        {
            // iterate the prev
            prev = prev.next;
            i++;
        }
        // now prev will be the node prev deletion
        prev.next = prev.next.next;
        return head;
        
    }
}