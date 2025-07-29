class Solution {
    public int largestRectangleArea(int[] heights) {
        // base case
        
        int maxarea = 0;
        // form 2 array of nsl and nsr
        int nsl[] = new int[heights.length];
        int nsr[] = new int[heights.length];

        
        
        
        
        // next samller right
        Stack<Integer> st = new Stack<>();

        // it will be as same as of next greater code
        // go backward
        for(int i= heights.length-1 ; i>=0 ; i--)
        {
            while(!st.isEmpty() && heights[st.peek()]>= heights[i])
            {
                //pop
                st.pop();
            }
            // other condition
            if(st.isEmpty())
            {
                // if no smaller then append n
                nsr[i] = heights.length;

            }
            else{
                // ans is top
                nsr[i] = st.peek();
            }
            // push the elem 
            st.push(i);
            
        }

        //next smaller left

        // make the stack empty
        st = new Stack<>();

        // it will be as same as of next greater code
        // go backward
        for(int i= 0 ; i< heights.length ; i++)
        {
            while(!st.isEmpty() && heights[st.peek()]>= heights[i])
            {
                //pop
                st.pop();
            }
            // other condition
            if(st.isEmpty())
            {
                // if no smaller then append n
                nsl[i] = -1;

            }
            else{
                // ans is top
                nsl[i] = st.peek();
            }
            // push the elem 
            st.push(i);
            
        }

        // find the area
        //width  = nsr[i] - nsl[i] -1
        for(int i = 0 ; i<heights.length ; i++)
        {
            int width = nsr[i] - nsl[i] -1;
            int height = heights[i];
            int  area = width *height;
            maxarea = Math.max(maxarea, area);
        }
        // print 
        return maxarea;
    }
}