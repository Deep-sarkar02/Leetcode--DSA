class Solution {
    public int[] productExceptSelf(int[] nums) {
        // now we will form the prefix array
        int pref[] = new int[nums.length];
        // and the suffix array
        int suf[] = new int[nums.length];
        // the first elem of the prefix will be 1
        pref[0] = 1;
        // now we will form the suffix of the each elemen
        for(int i= 1 ; i<nums.length ; i++)
        {
            pref[i] = pref[i-1] * nums[i-1];
        }
        // the last elem of the suff will be 1
        suf[nums.length - 1] = 1;
        // now loop from the n-2 to the 0
        for(int i = nums.length -2 ; i >=0 ; i--)
        {
            suf[i] = suf[i+1] *nums[i+1];
        }
        // now the prefix and the suffix are created so we will loop  normally and now we will nul all the element to form the asns
        int ans[] = new int[nums.length];
        for(int i = 0 ; i< nums.length ; i++)
        {
            ans[i] = pref[i]  * suf[i];
         }
        return ans;
    }
}