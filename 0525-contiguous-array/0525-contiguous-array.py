class Solution(object):
    def findMaxLength(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        for i in range(len(nums)):
            # now  replace the 0 with -1
            if(nums[i] == 0):
                #replace the element with -1
                nums[i] = -1
        # initialise the var
        l= 0
        sum = 0
        map = {}
        k = 0
        for j in range(len(nums)):
            # form the sum
            sum+=nums[j]
            # if sum == 0
            if (sum == k) :
                # find the lenght
                l = max(l , j+1)
            #if the sum not in map
            if sum not in map:
                map[sum] = j
            # if sum - k in the map
            if (sum - k) in map:
                # find the lenght
                l = max(l , j-(map[sum-k]))
        return l
        