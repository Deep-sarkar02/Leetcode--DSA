class Solution {
    public int minCostClimbingStairs(int[] cost) {
        // Write your code here
        int n  = cost.length;
        int [] minc = new int[n+1];
        for(int i = 2 ; i <= n ; i++)
        {
            minc[i] = Math.min((cost[i-1] + minc[i-1]) ,(cost[i-2] + minc[i-2]));
            
        }
        return minc[n];
    }
}