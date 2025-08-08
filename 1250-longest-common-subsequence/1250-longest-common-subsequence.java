class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
         //construct a dp matrix 
        // col and row
        int[][] dp = new int[s1.length()][s2.length()];
        // now loop over the matrix
        // for each of the row
        for(int i = 0 ; i< s1.length() ; i++)
        {
            // for each of the col
            for(int j = 0 ; j<s2.length() ; j++)
            {
                // if the last char if they are equal 
                if(s1.charAt(i) == s2.charAt(j))
                {
                    // for the row after 0 th row
                    if(i > 0 && j >0)
                    {
                         // then we will add the prev value
                        dp[i][j] = 1+dp[i-1][j-1];
                    }
                    
                    // else case for the 1st row the 0 th one
                    else
                    {
                        dp[i][j] = 1;
                    }
                   
                }
                
                //now if the char doesnot match
                // make the max 
                else
                {
                    // get the top and the left value
                    int top;
                    int left ;
                    
                    // if the row > 0 then get the top value
                    if(i >0)
                    {
                        top = dp[i-1][j];
                    }
                    else
                    {
                        top = 0;
                    }
                    // same for the left
                    // if the j > 0 then get the top value
                    if(j >0)
                    {
                        left = dp[i][j-1];
                    }
                    else
                    {
                        left = 0;
                    }
                    
                    
                    // fill with the max
                    dp[i][j] = Math.max(top , left);
                }
            }
           
        }
         return dp[s1.length()-1][s2.length()-1];
    }
}