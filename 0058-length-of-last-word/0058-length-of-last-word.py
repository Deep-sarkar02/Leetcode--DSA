class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        # s.strip()
        p= (s.strip().split(" "))
        # print(p)
        return (len(p[len(p)-1]))
        