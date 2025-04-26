class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        ans = []
        dic = {}
        for i in strs:
  
        # form string from char
            j  = (''.join(sorted(i)))
            if j not in dic:
                dic[j] = [i]
            else:
                dic[j].append(i)

    
        for k in dic.values():
            ans.append(k)
        return ans
        