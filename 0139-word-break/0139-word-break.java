class Solution {
    public boolean wordBreak(String s, List<String> wo) {
        Set<String> wordset = new HashSet<>(wo);
        // now we will find the max len
        int maxl = 0 ;
        for(String w : wordset)
        {
            maxl = Math.max(maxl , w.length());
        }
        // now make  the array of dp
        int n = s.length();
        boolean[] dp = new boolean[n+1];
        // now we will loop over t the dp
        dp[0] = true;
        // now we will loop over the dp
        for(int i = 1 ; i <=n ; i++)
        {
            for(int j = i-1 ; j >= Math.max(0 , i-maxl); j-- )
            {
                if(dp[j] && wordset.contains(s.substring(j , i)))
                {
                    dp[i] = true;
                    break;
                }
            }
            
        }
        return dp[n];
    }
}