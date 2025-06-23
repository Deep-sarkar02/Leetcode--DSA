/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        // edge case:=
        if(head == null)return null;
        // code here
        // create an undorderd map 
        HashMap<Node , Node>m = new HashMap<>();
        // now creaate a new new node to store the val of the old node
        Node newHead = new Node(head.val); // this will store the data in the old head
        
        // now we will make an old temp
        // it will point the next node of the old head
        Node oldtemp = head.next;
        // and a new temp will point to the new head
        Node newtemp = newHead;
        
        // store the first old and the new data in the map
        m.put(head , newHead);
        
        // now we will traveerse the loop  and copy the data
        while(oldtemp != null)
        {
            
            newtemp.next = new Node(oldtemp.val);
            
            // now store the oldtemp and the new temp in the map
            m.put(oldtemp,newtemp.next);
            // update the old temp and new temp
            oldtemp = oldtemp.next;
            newtemp = newtemp.next;
        }
        
        // after the loop we will again reassign the newtemp to the new head
        newtemp = newHead;
        // same the oldtemp to head
        oldtemp = head;
        // now we will again traverse the loop 
        while(oldtemp != null)
        {
            // important step
            newtemp.random =m.get(oldtemp.random); // it will give the new address
            // update the old and the new temp
            oldtemp = oldtemp.next;
            newtemp = newtemp.next;
        }
        
        // now we can return the newHead
        return newHead;
        
    }
}