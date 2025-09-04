class Solution {
    public int coinChange(int[] coins, int sum) {
         if(sum < 1) return 0;
        int dp[] = new int[sum+1];
        dp[0] = 0 ;
        for(int i = 1 ; i <= sum ; i++)
        {
            // fill the arrya with the max value
            dp[i] = Integer.MAX_VALUE;
        
            // for each of the coin
            for(int c : coins)
            {
                if(c <= i && dp[i-c] !=  Integer.MAX_VALUE)
                {
                    dp[i] =  Math.min(dp[i] , 1+dp[i-c]);
                }
            }
        }
        if(dp[sum] == Integer.MAX_VALUE)
        {
            return -1;
        }
        return dp[sum];
    }
}