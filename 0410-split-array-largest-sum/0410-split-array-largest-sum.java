class Solution {
    public boolean helper(int[] arr , int k ,int max_sum)
    {
        int val = arr[0];
        int count = 1;
        // nwo loop from 1 to N
        for(int  i = 1 ; i< arr.length ; i++ )
        {
            // find the valeu sum
            val += arr[i];
            // check if the val> max_sum
            if(val > max_sum)
            {
                // now we will  increse the count
                count++;
                // val = next val
                val = arr[i];
            }
        }
         return (count<=k);
    }
    public int splitArray(int[] nums, int k) {
        // if the value of k is 1 then we can split in only in one part , ie, all the elem wil there be inside that part
        // min =  sum of all  the arr elem
        // and if the k  == size of the arr then the max is the max elem of the arr

        int maxVal = 0;
        int sum = 0;
        for(int i = 0 ; i< nums.length ;i++)
        {
            if(nums[i] > maxVal)
            {
                maxVal = nums[i];
            }
            sum += nums[i];
        }

        // now our largest sum of the split will be betwenn then  max and the sum
        int start = maxVal; 
        int end  = sum ;
        int ans = -1;
        // now make the binary search 
        while(start <= end)
        {
            // find the mid or the possible value
            int mid = start +(end - start)/2;
            // now check if the mid is  the proper max sum or not
            if(helper(nums ,  k , mid))
            {
                //if ok  then store the value to the ans
                ans = mid;
                // and search for the min max , 
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
        return ans;
    }
}