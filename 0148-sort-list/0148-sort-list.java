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
    public ListNode sortList(ListNode head) {
        //store all the element in the array
        ArrayList<Integer> a = new ArrayList<>();
        //loop over the ll and store all the value 
        ListNode temp = head;
        while(temp != null)
        {
            a.add(temp.val);
            temp = temp.next;
        }
        System.out.println(a);
        Collections.sort(a);
        // now we will loop over the array and replace 
        int i = 0;
        temp = head;
        while(temp != null)
        {
           
                temp.val = a.get(i);
                i++;
                temp = temp.next;
            
            
        }
        return head;
    }
}