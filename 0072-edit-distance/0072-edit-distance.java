class Solution {
    public int minDistance(String s1, String s2) {
        // Code here
        // GET THE LENGTHN OF THE 2 STRING
        int m  = s1.length();
        int n = s2.length();
        
        // form the dp matrix of size +1
        int[][] dp =new int[m+1][n+1];
        // we need to make m in the col and n in the row
        
        // loop over the dp matrix
        for(int i = 0 ; i<=m ; i++)
        {
            // for all the row first colm will be 
            // initialise the matrix
            dp[i][0] = i;
        }
        //now for the 2nd string we will also do the same
        for(int j = 0 ; j<= n ; j++)
        {
            dp[0][j] = j;
        }
        
        
        // now we will loop over the dp matrix
        for(int i = 1 ; i<=m ; i++)
        {
            for(int j=1 ; j<=n ; j++ )
            {
                // if both the char are same
                // since the first char is " " so i-1 and j-1
                if(s1.charAt(i-1) == s2.charAt(j-1))
                {
                    // copy from top left 
                    dp[i][j] = dp[i-1][j-1];
                }
                else
                {
                    // get the min of the 3 
                    int top_l = dp[i-1][j-1];
                    int top = dp[i-1][j];
                    int left = dp[i][j-1];
                    
                    dp[i][j] = Math.min(top_l , Math.min(top , left))+1;
                }
            }
            
        }
        return dp[m][n];
        
    }
}