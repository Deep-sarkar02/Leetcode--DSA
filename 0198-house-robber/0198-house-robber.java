class Solution {
    public int rob(int[] arr) {
         // code here
        if(arr.length< 2) return arr[0];
        // dp
        int dp[] = new int[arr.length];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0] , arr[1]);
        for(int i= 2 ; i <arr.length ; i++)
        {
            dp[i] = Math.max(dp[i-2]+arr[i] , dp[i-1]);
        }
        return dp[arr.length-1];
        
    }
}