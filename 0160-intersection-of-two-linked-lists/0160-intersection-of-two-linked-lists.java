/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // p1 will point headA
        ListNode p1 = headA;
        // SAME FOR HEADB
        ListNode p2 = headB;
        // we will traverse the the list while p1 != p2
        while(p1 != p2)
        {
            // check if any one of the pointer is pointing to null
            if(p1 == null)
            {
                p1 = headB;// run the same pointer on the diff list
            }
            else
            {
                p1 = p1.next;
            }
            if(p2 == null)
            {
                p2 = headA;// run the same pointer on the diff list
            }
            else
            {
                p2 = p2.next;
            }

        }
        // if the loop breaks ie, any they are equal
        // so we can return any one p1 or p2
        return p1;

        
    }
}