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
        // code here
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null)
        {
            // increament
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow)
            {
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return null;
        }
        // now again initialise the slow to head
        slow = head;
        while(slow != fast)
        {
            // increament
            slow = slow.next;
            fast = fast.next;
        }
        // now we can return any of the pointer
        return slow;
    }
}