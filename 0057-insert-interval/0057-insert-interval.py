class Solution:
    def insert(self, intervals, newInterval):
        intervals.append(newInterval)
        # now sort the intervals
        intervals.sort()
        # create the ans
        ans = [intervals[0]]
        # atart loopin over the intervals array
        # from 1 to len of the array
        for i in range(1 , len(intervals)):
            if(intervals[i][0]  <= ans[-1][1]):
                ans[-1][1] = max(ans[-1][1] , intervals[i][1])
            else:
                ans.append(intervals[i])
        return ans
             
        