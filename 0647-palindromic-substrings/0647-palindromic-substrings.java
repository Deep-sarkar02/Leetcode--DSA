class Solution {
    public int pal(String s , int l , int r)
    {
        int count = 0 ;
        
        // get the count
        while(l >= 0 && r <s.length() && s.charAt(l) == s.charAt(r) )
        {
            
            
                count++;
            
            
            l--;
            r++;
        }
        return count;
    }
    public int countSubstrings(String s) {
        // code here
        int count = 0 ; 
        for(int i = 0 ; i < s.length() ; i++)
        {
            //get the odd 
        count += pal(s , i , i);
        
        // even
        count += pal(s , i , i+1);
        }
        
        return count;
    }
}