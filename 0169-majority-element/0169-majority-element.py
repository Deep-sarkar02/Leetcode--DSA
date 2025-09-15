class Solution(object):
    def majorityElement(self, nums):
        r = len(nums)/2
        d = {}
        
        for i in range(len(nums)):
            
            if nums[i] not in d:
                d[nums[i]] = 1
            else:
                d[nums[i]] +=1 
        print d
        # print that key whuch value if more than r
        for k ,v in d.items():
            if v >r:
                return k
            

        