class Solution {
    int ar = Integer.MIN_VALUE;
    public int maxArea(int[] height) {
        int lh = 0;
        int rh = height.length - 1;
        while(lh < rh)
        {
            // find the ara
            int area = Math.min(height[lh] , height[rh]) * (rh -lh);
            // compare the area
            ar = Math.max(area , ar);
            // increase or decrese
            if(height[lh]  <height[rh] )
            {
                lh++;
            }
            else
            {
                rh--;
            }
            
        }
        return ar;
        
    }
}