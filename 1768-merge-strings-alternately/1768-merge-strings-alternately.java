class Solution {
    public String mergeAlternately(String s1, String s2) {
        // code here
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;
        while(i<s1.length() && j<s2.length())
        {
            sb.append(s1.charAt(i++));
            sb.append(s2.charAt(j++));
        }
        while(i<s1.length())
        {
            sb.append(s1.charAt(i++));
        }
         while(j<s2.length())
        {
            sb.append(s2.charAt(j++));
        }
        
        return sb.toString();
    }
}