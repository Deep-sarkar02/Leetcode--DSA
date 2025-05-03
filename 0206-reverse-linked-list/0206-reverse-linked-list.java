class Solution {
    public ListNode reverseList(ListNode head) {
        /*// if the list is empty
        // if the size of the LL < 2 ie, 1
        if(head == null) // if the LLis empty then the head will point to null
        {
            return head;
        }
        // take the var
        ListNode prev = null ;
        ListNode pres = head;
        ListNode next = pres.next;
        // now loop  while pres value  will be null then break
        while(pres != null)
        {
            // now condition:
            pres.next = prev;
            
            
            //update all the var by 1step
            prev = pres;
            pres = next;
           if(next != null)
           {
             next = next.next;
           }
        }
        // after all this step when the loop breaks it means that the pres is null so the prev is the last node and eventually it will become the 1st element
        // so we will convert the head to the prev
        //head = prev;
        
        
        
        // so return the prev
        return prev;*/
        ListNode preNode = null;
        ListNode currNode = head;
        while(currNode != null)
        {
            // now nextNode wis the currnode.next
            ListNode nextNode = currNode.next;
            // now cuurnode will point to prenode
            currNode.next = preNode;
            //update the prnode
            preNode = currNode;
            // update the currNode
            currNode = nextNode;

        }
        // now return the preNode
        return  preNode;

        
    }
}