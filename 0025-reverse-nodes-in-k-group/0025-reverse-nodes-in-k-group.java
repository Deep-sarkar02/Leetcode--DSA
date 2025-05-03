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
    public ListNode reverseKGroup(ListNode head, int k) {
        // first check that the list has element s > than k
        ListNode curr = head;
        for (int i =0 ; i<k ; i++)
        {
            // check if the curr == null
            if(curr == null)
            {
                // so we will retunr the head 
                return head;
            }
            // for the else part 
            // update the crr
            curr = curr.next;
        }
        // step :2
        // now reverse the kth part
        curr = head;
        int count = 0 ;// to count the k 
        ListNode prev = null;
        while(count<k)
        {
            ListNode save = curr.next;
            curr.next = prev;
            prev = curr;
            curr = save;
            count++;
        }
        // step : 3
        if(curr != null)
        {
            head.next = reverseKGroup(curr,k);
            // so if no element is presetn then return the prev
            
        }
        return prev;
        

        
    }
}