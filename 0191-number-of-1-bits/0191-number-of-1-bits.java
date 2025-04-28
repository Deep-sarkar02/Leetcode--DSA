class Solution {
    public int hammingWeight(int n) {
        int c = 0;
        while( n!= 0)
        {
            if((n & 1) != 0)
            {
                c++;
            }
            // right shift by 1
            n = n>>1;
        }
        return c;
    }
}