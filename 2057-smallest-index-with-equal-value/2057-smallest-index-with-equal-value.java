class Solution {
    public int smallestEqual(int[] nums) {
        int smallest = -1;
        for(int i = 0 ; i <nums.length ; i++)
        {
            // if they are equal then find the smallest in them
            int a = nums[i];
            if(i%10 == nums[i])
            {
                return i;
            }
        }
        return -1;
    }
}