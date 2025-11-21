class Solution {
    public int numDecodings(String s) {
         // code here
        int n = s.length();
        
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = s.charAt(0)=='0' ? 0 : 1;
        for(int i = 2 ; i <=n ; i ++)
        {
            int od = Integer.parseInt(s.substring(i-1 , i));
            int td = Integer.parseInt(s.substring(i-2 , i));
            // check the validity
            if(od >= 1 && od<=9)
            {
                dp[i] += dp[i-1];
            }
            if(td >=10 && td <= 26)
            {
                dp[i] += dp[i-2];
            }
        }
        return dp[n];
    }
}