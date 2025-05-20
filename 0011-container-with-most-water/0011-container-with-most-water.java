class Solution {
    public int maxArea(int[] height) {
      // Code Here
        int lp = 0;
        int rp = height.length -1;
        int ans = 0; // this will be maximum
        while(lp < rp)
        {
            int width = rp - lp ;// find the width
            int h = Math.min(height[lp] , height[rp]); // find the height
            int water_a = width * h;
            ans = Math.max(ans ,  water_a);
            // if the boundary of the left < right
            if(height[lp] < height[rp])
            {
                lp++;
            }
            else{
                rp--;
            }
            
            
        }
        return ans;
    }  
    
}