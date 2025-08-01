class Solution {
    public int evalRPN(String[] tokens) {
         // code here
        Stack<Integer> st = new Stack<>();
        // loop the string
        for(int i= 0 ; i <  tokens.length ; i++)
        {
            //if operator
            if( tokens[i].equals("+") ||
                 tokens[i].equals("-") ||
                 tokens[i].equals("*") ||
                 tokens[i].equals("/") )
                {
                    // pop 2 times
                    int b  = st.pop();
                    int a = st.pop();
                    int res = 0 ;
                    if( tokens[i].equals("+") ) res = a+b;
                    if( tokens[i].equals("-") ) res = a-b;
                    if( tokens[i].equals("*")) res = a*b;
                    if( tokens[i].equals("/") ) res = a/b;
                    
                    // push res to stack
                    st.push(res);
                }
            else
            {
                st.push(Integer.parseInt( tokens[i]));
            }
            
            
        }
        return st.peek();
    }
}