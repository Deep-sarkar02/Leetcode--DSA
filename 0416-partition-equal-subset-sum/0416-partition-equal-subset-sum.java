class Solution {
    public boolean rec(int idx , int target , int [] nums , Boolean [][] dp)
    {
        // write the base case
        // this order will be followed
        if(target == 0) return true;
        if(idx < 0) return false;  
        if(dp[idx][target] != null) return dp[idx][target];

        boolean yes = nums[idx] > target ? false : rec(idx-1 , target-nums[idx] , nums , dp);
        boolean no = rec(idx-1 , target , nums , dp);

        return dp[idx][target] = (yes || no);
    }
    public boolean canPartition(int[] nums) 
    {
          //find the total first
          int total = 0;
          for (int e : nums)
          {
            total += e;
          } 
          // check if the total is not odd
          if(total  % 2 == 1) // odd
          {
            return false;
          }
          //use the memoisation for the dp table
          Boolean [][] dp = new Boolean[nums.length][total /2 +1];
          // for even 
          return rec(nums.length-1  , total/2 , nums , dp); // send the length of the array which will be decresing by 1 each of the step , target value and the array or the nums
    }
}