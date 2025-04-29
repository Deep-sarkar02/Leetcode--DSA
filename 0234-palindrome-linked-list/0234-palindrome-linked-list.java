class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode curr =  head;
        // stack to traverse the full ll
        Stack<Integer> st = new Stack<>();
        // now push  all the elem to the stack
        while(curr != null)
        {
            // now push the value to the stack
            st.push(curr.val);
            // inccrese the curr
            curr = curr.next;
        }
        // now on the next step again point the curr to thead
        curr = head;
        // traverse the ll agin and if the peek ele not math return false
        while(curr != null)
        {
            // 
            if(st.peek() != curr.val)
            {
                return false;
            }
            // else case
            st.pop();
            curr = curr.next;
        }
        return true;
        
    }
}