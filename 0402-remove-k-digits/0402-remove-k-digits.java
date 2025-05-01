class Solution {
    public String removeKdigits(String num, int k)
    {
        // create a charecter stack
        Stack<Character>st = new Stack<>();
        // now we will loop over the nums array
        for(int i = 0 ; i< num.length() ; i++)
        {
            // conver the each char to the char
            char ch = num.charAt(i);
            // now we will pop from the stack
            while(!st.empty() && k> 0 && st.peek() >ch)
            {
                // this is the condition for  pop of the element
                st.pop();
                // decrese the k value
                k--;
            }
            // if this loop breaks then push the remaining eleme to the stach
            st.push(ch);
        }

        // now if  the stack is in incresing order  then remove the k element from the stack
        while(k>0)
        {
            st.pop();
            k--;
        }
        // important:-
        // now we will reverse the stack by the help of  the Stringbuilder
        StringBuilder sb = new StringBuilder();
        // now we will push the stack element 
        while(!st.empty())
        {
            // we will pop from the stack and then push to the string
            sb.insert(0 , st.pop());
        }


        // now we will check leading zeros
        while(sb.length() > 0 && sb.charAt(0) == '0')  // if the char at the index 0 is 0 then we will remove that
        {
            // delete the char at 0 index
            sb.deleteCharAt(0);
        }
        // now if the string length is null 
        if(sb.length()==0)
        {
            return "0";
        }
        // else we will retunr 
        return sb.toString();

    }
}