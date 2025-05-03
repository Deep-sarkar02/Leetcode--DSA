class Solution {
    public int trap(int[] height) {
        // find the left max
        int leftMax[] = new int[height.length];
        // find the left max
        leftMax[0] = height[0];
        // and from the i = 0 run the loop
        for(int i = 1 ;i< height.length ; i++)
        {
           leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }

        
        
        
        // for the rights max
        int rightMax[] = new int[height.length];
        rightMax[height.length-1] = height[height.length-1];
        for(int i = height.length-2 ;i>=0  ; i--)
        {
           rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }
        int sum = 0;
        // now we will form the loop over the height
        for(int i = 0 ; i<height.length ; i++)
        {
            sum = sum +( Math.min(leftMax[i], rightMax[i]) -height[i]);
        }
        return sum;
    }
}