class Solution {
    public int longestValidParentheses(String s) {
        // code here
        Stack<Integer> st = new Stack<>();
        // if the stack is push -1
        st.push(-1);
        // now we will travese by the string
        int maxLen = 0 ;
        for(int i = 0 ; i< s.length() ; i++)
        {
            // if it is the opeing bracket
            if(s.charAt(i) == '(')
            {
                // push the index to the stack
                st.push(i);
            }
            else
            {
                st.pop();
                // but after the pop is the stack will be empty
                
                // push the index
                if(st.isEmpty())
                {
                    st.push(i);
                }
                else
                {
                    // find the max length
                    maxLen = Math.max(maxLen , i - st.peek());
                }
                
            }
            
        }
        // now return the i value 
        return maxLen;
    }
}