class Solution(object):
    def longestConsecutive(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # sort it 
        nums.sort()
        if (len(nums) == 0):
            return 0
        ans = 1
        val = 1
        for i in range(1 , len(nums)):
            if (nums[i] == nums[i-1]):
                continue
            if(nums[i] == nums[i-1]+1):
                val +=1
            else:
                val = 1
            ans = max(ans , val)
        return ans
        