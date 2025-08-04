class Solution {
    public String decodeString(String s) {
        Stack<Character> st = new Stack<>();
        
        // loop throught the string
        for(int i = 0 ; i<s.length() ; i++)
        {
           // when closing brack is not coming push
           if(s.charAt(i) != ']') st.push(s.charAt(i));
           
           else
           {
               // form the string
               StringBuilder word = new StringBuilder();
               while(!st.isEmpty() && st.peek()!= '[')
               {
                   // form the string in the reversed order
                   word.insert(0 , st.pop());
                   
               }
               
               // pop the open bracket
               st.pop();
               
               // also get the number
               StringBuilder k = new StringBuilder();
               while(!st.isEmpty() && Character.isDigit(st.peek()))
               {
                   k.insert(0 , st.pop()); // in the reversed order
                 
               }
               
               // convert from string to int
               // and from stringbuilder to string
               int num = Integer.parseInt(k.toString());
               
               
               
               
               // now repeat the string
               String repeated = word.toString().repeat(num);
               
               // covert string to char array
               for (char c :repeated.toCharArray() )
               {
                   //push the char to stack
                   st.push(c);
               }
               
           }
        }
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty())
        {
            ans.insert( 0 , st.pop());
            //st.peek();
        }
        
        return ans.toString();
    }
}