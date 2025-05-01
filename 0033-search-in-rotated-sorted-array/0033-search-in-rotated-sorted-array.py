class Solution:
    def search(self, nums, target):
        ind = -1
        for i in range(len(nums)):
            if(nums[i] == target):
                ind = i
        return ind
        