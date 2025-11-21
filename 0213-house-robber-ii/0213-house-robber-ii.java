class Solution {
    public int robh(int arr[])
    {
        // base
        if(arr.length == 1)
        {
            return arr[0];
        }
        // create a dp array with the same length
        int dp[] = new int[arr.length];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0] , arr[1]);
        for(int i = 2 ; i<arr.length ; i++)
        {
            dp[i] = Math.max(dp[i-2]+arr[i] , dp[i-1]);
        }
        return dp[arr.length - 1];
    }
    public int rob(int[] arr) {
         // code here
        // base case
        if(arr.length == 1) return arr[0]; // return the first element
        // now create the 2 array for the skip  first and the skip last
        int [] skip_f = new int[arr.length-1];
        int [] skip_l = new int[arr.length-1];
        for(int i = 0 ; i <arr.length-1;i++)
        {
            skip_l[i] = arr[i];
            skip_f[i] = arr[i+1];
        }
        // now we will use the rob1 method over this 2 array 
        int s_f = robh(skip_f);
        int s_l = robh(skip_l);
        // return the max from the both
        return Math.max(s_f , s_l);
    }
}