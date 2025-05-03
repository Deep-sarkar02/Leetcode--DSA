class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) 
    {
        // create a dummy node at the first
        ListNode dummy = new ListNode(0);
        // now next of the dummy will point the head of the list
        dummy.next = head;
        // now create the pointers
        ListNode leftpre = dummy;
        ListNode currnode = head;
        // now traverse the loop to the left-1 and the curr at last will point to the left and the prenode will point to the left -1
        for(int i = 0 ; i<left-1 ; i++)
        {
            // update theboth of them
            leftpre = leftpre.next;
            currnode = currnode.next;
        }  
        // we wil store the currnode to the sublist head 
        ListNode sublisthead = currnode;
        // now for the revarsa we need a null
        ListNode prenode = null;
        // now run the loop from 0 to right-left
        for(int i = 0 ;i<=right-left ; i++)
        {
            //udate and inititalise the next pointer
            ListNode next = currnode.next;
            //now the cuurnode will point the prev node
            currnode.next = prenode;
            //update the prev and the currnode
            prenode = currnode;
            currnode = next;
        }
        // atlast after the right the curr node will be there and the sublist head will point it
        sublisthead.next = currnode;
        // and the prenode will be pointe by the leftpre
        leftpre.next = prenode;
        // now the dummy.next will point the head
        return dummy.next;
    }
}