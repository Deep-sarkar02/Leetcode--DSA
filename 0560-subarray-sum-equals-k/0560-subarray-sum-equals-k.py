class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        sum_map = {0 : 1}
        pref_sum = 0
        count = 0
        for n in nums:
            pref_sum +=  n
            if pref_sum - k in sum_map:
                count += sum_map[pref_sum - k]
            # in the else case
            if(pref_sum in sum_map):
                sum_map[pref_sum] +=1
            else:
                sum_map[pref_sum] =1
        return count
        