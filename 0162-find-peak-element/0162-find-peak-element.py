class Solution:
    def findPeakElement(self, nums):
        for i in range(len(nums)):
            if(len(nums) == 1 and nums[i]> float('-inf')):
                return i
            elif(i==0 and nums[i]>nums[i+1] and nums[i] > float('-inf')):
                return i
            elif(i == len(nums)-1 and nums[i] > nums[i-1] and nums[i] > float('-inf')):
                return i
            else:
                if(nums[i]  >nums[i+1] and nums[i] > nums[i-1]):
                    return i
        