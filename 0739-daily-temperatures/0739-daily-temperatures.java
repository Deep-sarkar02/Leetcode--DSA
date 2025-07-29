class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // stack
        Stack<Integer> st = new Stack<>();
        // arraylist
        ArrayList<Integer> ans = new ArrayList<>();
        int n  = temperatures.length;
        for (int i  = n-1 ; i >= 0 ; i--)
        {
            // now we will take a increasing stack
            while(!st.isEmpty() && temperatures[st.peek()] <= temperatures[i])
            {
                st.pop(); // pop  the stack
            }
            // if the stack is empty
            if(st.isEmpty())
            {
                ans.add(0); // add 0
            }
            // valid case
            else
            {
                ans.add(st.peek() - i);
            }
            // also push the i
            st.push(i);
        }

        Collections.reverse(ans);
        // arraylist to array
        int[] arr = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            arr[i] = ans.get(i); 
        }
        return arr;
        
    }
}