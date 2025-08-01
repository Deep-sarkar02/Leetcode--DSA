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
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!= null && fast.next != null)
        {
            // update the fast and the slow
            fast = fast.next.next;
            slow = slow.next;
            // check if fast and slow matches
            if(fast == slow)
            {
                return true;
            }
        }
        return false;
    }
    
}