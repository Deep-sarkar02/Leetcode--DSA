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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //base case
        if(list1 == null)
        {
            return list2;
        }
        if(list2 == null)
        {
            return list1;
        }
        // case 1
        if(list1.val <= list2.val)
        {
            // now we will return the list 1
            list1.next =  mergeTwoLists( list1.next,  list2);
            return list1;
        }
        else
        {
            // now we will return the list 1
            list2.next =  mergeTwoLists( list1,  list2.next);
            return list2;
        }
        
    }
}