class Solution {
    public boolean isPowerOfTwo(int n) {
        // no. less than = 0 is always false
        if(n<=0)
        {
            return false;
        }
        return((n & n-1) == 0);
       
    }
}