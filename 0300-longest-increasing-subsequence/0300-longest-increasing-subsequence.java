class Solution {
    public int lengthOfLIS(int[] nums) {
        // create the array to memoise
        int [] t = new int [nums.length];
        // loop over the array
        // i at 1
        // j at 0
        for(int i = 1 ; i<nums.length ; i++)
        {
            // i always atart at 1
            // now j will staart from 0 to i
            for(int j = 0 ; j< i ; j++)
            {
                // if the j value wll be less
                if(nums[j] < nums[i])
                {
                    // we will upate the  i th place in the array
                    if(t[j] + 1 > t[i]) // if t[i] +1 will be greater than the t[j]
                    {
                        t[i] = t[j]+1;
                    }
                }
            }
        }
        
        // find the max index
        int max = 0;
        // loop from the t
        for(int i = 0 ; i <t.length ; i++)
        {
            if(t[i] > t[max])
            {
                max = i; // get the max index
            }
        }
        return t[max] +1;
    }
}