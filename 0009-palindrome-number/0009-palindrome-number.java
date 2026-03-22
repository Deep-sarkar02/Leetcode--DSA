class Solution {
    public boolean isPalindrome(int n) {
        int temp = n;
        int rv = 0;
        int ld;
        // now we will reverse it
        while(n>0)
        {
            ld = n%10;
            rv = (rv * 10) +ld;
            n = n/10;
        }
        return rv == temp;
    }
}