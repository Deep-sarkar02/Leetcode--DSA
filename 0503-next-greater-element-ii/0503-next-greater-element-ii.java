class Solution {
    public int[] nextGreaterElements(int[] nums) 
    {
        

        // Create array with size (maxVal + 1) and fill with 0
        int arr[] = new int[nums.length];
        for(int i = 0; i <nums.length; i++) {
            arr[i] = -1;
        }

        // Stack for tracking next greater elements
        Stack<Integer> st = new Stack<>();

        // loop the array from the len 
        for(int i= nums.length-1 ; i>=0  ;i--)
        {
            // pussh the elemt to stack
            st.push(nums[i]);
        } 

        
        //after pushing then 
        //loop from the end and check 
        for(int i= nums.length-1 ; i>=0  ;i--)
        {
            while(!st.empty() && st.peek() <= nums[i])
            {
                st.pop();
            }
            if(!st.empty())
            {
                arr[i]= st.peek();
            }
            st.push(nums[i]);
        }
        return arr;
    }
}