class Solution {
    public int balancedStringSplit(String s) {
        // ans var and count vari
        int ans = 0;
        int count = 0;
        for(int i =0 ; i < s.length() ; i++)
        {
            // access the char at i 
            if(s.charAt(i) == 'R')
            {
                // increse count
                count++;
            }
            else
            {
                count--;
            }
            //if thecout  == 0 then ans++
            if(count == 0)
            {
                ans++;
            }
        }
        return ans;
    }
}