
class Solution {
    public  ListNode findmid(ListNode head)
    {
        ListNode f = head;
        ListNode s = head;
        while(f.next != null && f.next.next != null)
        {
            s= s.next;
            f = f.next.next;
        }
        return s;
    }

    // merge 2 sorted ll
    public ListNode merge2sortedll(ListNode h1 , ListNode h2)
    {
        if(h1 == null)
        {
            return h2;
            
        }
        if(h2 == null)
        {
            return h1;
        }
        
        // case1
        if(h1.val <= h2.val)
        {
            h1.next = merge2sortedll(h1.next , h2);
            return h1;
        }
        
        // case 2
        else
        {
            h2.next = merge2sortedll(h1 , h2.next);
            return h2;
        }
    }

    public ListNode sortList(ListNode head) {
        // code here
        if(head == null || head.next == null)
        {
            return head;
        }
        // find the middle fo the node
        ListNode middle = findmid(head);
        
        // now the lefthead is the head
        ListNode lh = head;
        // now the right head is the left.next
        ListNode rh = middle.next;
        
        // now we will make the mid.next = null
        middle.next = null;
        // again do this for the lh and the rh
        ListNode sl = sortList(lh);
        ListNode rl = sortList(rh);
        
        // merege 2 sorted ll
        return merge2sortedll(sl , rl);
    }
}