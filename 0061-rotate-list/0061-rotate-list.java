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
    public ListNode rotateRight(ListNode head, int k) {
        // edge case
        if(head == null || head.next == null || k == 0)
        {
            return head;
        }
        else
        {
            // find the length of the list
            ListNode temp = head;
            int l = 1;
            while(temp.next!= null) // if the temp.next not = null
            {
                temp = temp.next;
                l++;
            }
            // now we have got the lenght
            // now we need to find out the actual rotation
            k = k%l;
            // if the k value now also 0 then also return the head
            if(k  == 0 ){
                return head;
            }
            // now temp will point to the last ndoe
            // now we will connect the temp to the first node
            temp.next = head;
            // now it will become the circular list

            // now we will traverse a loop from head to the k
            ListNode tail = head;
            for(int i = 1 ; i< (l - k) ; i++)
            {
                tail = tail.next;
            }
            // now we have got the new tail
            // now we will create the new head\
            ListNode newHead = tail.next;
            // now tail.next will be null
            tail.next = null;
            return newHead;
        }
    }
}