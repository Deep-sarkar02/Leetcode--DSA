class Solution {
    static int[][][]dp;
    static int helper(int[] arr , int k , int i , boolean cb )
    {
        // base
        if(i == arr.length || k==0) return 0;
        int buy = cb ? 1:0;
        if(dp[i][k][buy] != Integer.MIN_VALUE)
        {
            return dp[i][k][buy];
        }
        // recursive case
        int involve = 0, ignore = 0;
        if (cb) //true
        {
            // 2 choices
            //if i want to buy the stock
            // k will bve same , i ++ and cb will be false
            involve = -arr[i] + helper(arr ,k , i+1 , false );
            // ignore
            ignore = helper(arr , k , i+1 , true);
            
        }
        else
        {
            // 2 choices
            // sell case
             involve = +arr[i] + helper(arr ,k-1 , i+1 , true );
             // ignore
            ignore = helper(arr , k , i+1 , false);
            
        }
        return dp[i][k][buy] = Math.max(involve , ignore);
        
    }
    public int maxProfit(int k, int[] prices) {
         // code here
        // now make the dp array
        int n = prices.length;
        //  create a  3d array 
        dp = new int [n][k+1][2];
        
        // initialise with impossible value
        for(int i = 0 ; i<n ;i++)
        {
            for(int j = 0 ; j<=k ; j++)
            {
                dp[i][j][0] = dp[i][j][1] = Integer.MIN_VALUE;
            }
        }
        boolean canbuy = true ;//initially
        return helper(prices , k , 0  , canbuy ); // 0 is the ith value
    }
}