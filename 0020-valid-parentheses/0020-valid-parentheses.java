class Solution {
    public boolean isValid(String s) 
    {
        // create a charecter stack
        Stack<Character> st = new Stack<>();
        // loop over the array
        for(int i =0 ; i<s.length() ;i++)
        {
            // if it is openng
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['  )
            {
                // push to stack
                st.push(s.charAt(i));
            }
            else
            {
                // check is the stack is empty
                if(st.empty())
                {
                    return false;
                }
                // now if it is mathcin
                else if(s.charAt(i) == ')'  && st.peek() == '('
                        ||s.charAt(i) == '}'  && st.peek() == '{' 
                        || s.charAt(i) == ']'  && st.peek() == '[')
                        {
                            // if this matches
                            st.pop();
                        }
                // if this not matches
                // then fasle
                else
                {
                    return false;
                }
            }
           
        }
         // now check if the stack is empty then true
            // else false
            if(!st.empty())
            {
                return false;
            }
            return true;
    }
}