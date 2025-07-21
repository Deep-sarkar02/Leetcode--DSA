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
 class pair{
    int val;
    ListNode node;
    pair(int val , ListNode node)
    {
        this.val = val;
        this.node  = node;
    }
 }
class Solution {
    public ListNode mergeKLists(ListNode[] lists) 
    {
        // create a pq
        // min heap
        PriorityQueue<pair> mh = new PriorityQueue<>((a , b)-> Integer.compare(a.val , b.val));
        // now ww will iterate over the list
        for(int i = 0 ; i<lists.length ; i++ )
        {
            // put all the m to the mh
            if(lists[i]!= null)
            {
                ListNode  temp  = lists[i];
            // now put it to the mh
            mh.add(new pair(temp.val , temp));
            }
            
        }
        // now our work will be dela with the mh
        ListNode ans = new ListNode(-1);
        // now temp will point to the ans
        ListNode temp = ans;
        while(!mh.isEmpty())
        {
            // now we will pop from the mh
            // put the node to the  curr
            ListNode curr = mh.poll().node;
            // now we will put thhe curr to the temp.next
            temp.next  = curr;
            // temp ++ 
            temp = temp.next;
            // check if curr.next != null
            if(curr.next!= null)
            {
                //put it to the mh
                mh.add(new pair(curr.next.val , curr.next));
            }
        }
        // now return the head
        return ans.next;
    }
}