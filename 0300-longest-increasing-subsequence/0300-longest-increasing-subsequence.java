class Solution {
    public int lowerbound(List<Integer> subset , int target)
    {
        int ans = subset.size();
        int left = 0;
        int right = subset.size()-1;
        while(left <= right)
        {
            int mid = (left + right)/2;
            if(subset.get(mid) >= target)
            {
                ans =  mid;
                right = mid -1;
            }
            else
            {
                left = mid+1;
            }
        }
        return ans;
    }
    public int lengthOfLIS(int[] nums) 
    {
        List<Integer> subset  = new ArrayList<>();
        for (int idx = 0 ; idx < nums.length ; idx ++)
        {
            int lb = lowerbound(subset , nums[idx]);
            if(lb < subset.size())
            {
                subset.set(lb , nums[idx]);
            }
            else
            {
                subset.add(nums[idx]);
            }
            
        }   
        return subset.size();
    }
}