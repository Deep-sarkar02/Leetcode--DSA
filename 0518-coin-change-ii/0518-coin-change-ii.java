class Solution {
    int dp[][];
    public int helper(int coins[] , int sum , int i)
    {
        
        // base case
        if(sum < 0) return 0;
        if(sum == 0) return 1;
        if(i == coins.length) return 0;
        // work
        // pick or no pick
        
        // if the dp[i][sum] != -1 
        if(dp[i][sum] != -1) return dp[i][sum];
        int pick = helper(coins , sum -  coins[i] , i); // the i  will not increse since , we can pick that i or that coin any no. of times since , of unlimited supply
        int np = helper(coins , sum , i+1) ; // go to next coin
        return dp[i][sum] = pick + np;
        
    }
    public int change(int sum, int[] coins) {
        //  make the dp table
        dp = new int [coins.length+1][sum+1];
       for(int i = 0 ; i<=coins.length ; i++)
       {
           for(int j = 0 ; j<= sum ; j++)
           {
               dp[i][j] = -1;
           }
       }
        return helper(coins , sum , 0);
    
        
    }
}