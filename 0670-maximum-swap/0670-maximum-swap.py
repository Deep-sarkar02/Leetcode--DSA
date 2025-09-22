class Solution(object):
    def maximumSwap(self, s):
         
        #code here
        # convert it to list
        s1 = str(s)
        li = list(s1)
        n = len(s1)
        # now find the max_idx on basis of each index
        for i in range(len(s1)):
            max_id = i
            for j in range(i+1 , len(s1)):
                if li[j] >= li[max_id]:
                    max_id = j
            # if if the max id element > i
            if li[max_id] > li[i]:
                # swap
                li[max_id],li[i] = li[i] , li[max_id]
                # now put it into ans
                ans = ""
                for i in li:
                    ans += i
                return int(ans) # it will be returned to the main
        return int(s1)