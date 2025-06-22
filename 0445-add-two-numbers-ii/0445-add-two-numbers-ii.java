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
    static ListNode  removeZero(ListNode head)
    {
        while(head!= null && head.val == 0 && head.next != null)
        {
            //traverse
            head = head.next;
        }
        return head;
    }
    
    static ListNode reverseList(ListNode head)
        {
            // write the script to reverse the list
        ListNode curr = head;
        ListNode next = null;
        ListNode prev = null;
        while(curr != null)
        {
            //next will be curr.ext
            next = curr.next;
            // reverrse the curr pointer
            curr.next = prev;
            //prev will point curr
            prev = curr;
            // curr will point next
            curr = next;
        }
        return prev;
        }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //make the reversee of the 2 list first
        l1 = reverseList(l1);
        l2 = reverseList(l2);

        // make a node for the ans
        ListNode  ans = new ListNode (0);
        // now curr will point to the ans
        ListNode  curr = ans;
        // now make the sum
        int carry = 0;
        while(l1 != null  || l2 != null || carry != 0)
        {
            // create the sum
            int sum = carry;
            if(l1 != null)
            {
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null)
            {
                sum += l2.val;
                l2 = l2.next;
            }
            // fidn the carry and the digit
            carry = sum / 10;
            int digit = sum %10;
            // now put the digit the list
            curr.next =new  ListNode(digit);
            curr = curr.next;

        }
         ListNode res = reverseList(ans.next);
         // now we will remove the leaaading 0
         return removeZero(res);
    }
}
