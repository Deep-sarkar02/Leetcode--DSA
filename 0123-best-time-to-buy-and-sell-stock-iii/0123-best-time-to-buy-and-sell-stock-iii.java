class Solution {
    static int [][][] dp;
    static int helper(int arr[] , int k , int i , boolean cb)
    {
        // base
        if(k == 0 || i == arr.length) return 0;
        // work
        int buy = cb ? 1 : 0;
        if(dp[i][k][buy] != Integer.MIN_VALUE)
        {
            return dp[i][k][buy];
        }
        int ignore = 0 , invlove = 0 ;
        if(cb )
        {
            invlove = -arr[i] + helper(arr , k , i+1 , false);
            ignore = helper(arr , k , i+1 , true);
        }
        else
        {
            invlove = +arr[i] + helper(arr , k-1 , i+1 , true);
            ignore = helper(arr , k , i+1 , false);
        }
         return dp[i][k][buy] = Math.max(ignore , invlove);
    }
    public int maxProfit(int[] prices) {
         int n = prices.length;
        // code here
        int k = 2;
        dp =new int [n][k+1][2];
        for(int i = 0 ; i < n ; i ++)
        {
            for(int j = 0  ; j <=k  ; j++)
            {
                dp[i][j][0] =  dp[i][j][1] = Integer.MIN_VALUE;
            }
        }
        // NOW CALL THE HELEPER
        boolean cb = true;
        return helper(prices , k , 0 , cb );
    }
}