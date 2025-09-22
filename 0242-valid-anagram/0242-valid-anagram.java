class Solution {
    public boolean isAnagram(String a, String b) {
            // if bothe  the length are not matching 
        if(a.length() != b.length()) return false;
        // createa a hmp
        HashMap<Character , Integer> hm = new HashMap<>();
        // now we will load the frq of each of the charecter
        for(int i = 0 ; i <a.length() ; i++)
        {
            // if presetn in the hm
            if(hm.containsKey(a.charAt(i)))
            {
                hm.put(a.charAt(i), hm.get(a.charAt(i))+1);
            }
            else
            {
                hm.put(a.charAt(i), 1);
            }
        }
        System.out.println(hm);
        // now loop overthe 2nd string
        for(int i = 0 ; i <b.length() ; i++)
        {
            // check 
            if(hm.containsKey(b.charAt(i)))
            {
                // less the freq
                if(hm.get(b.charAt(i)) == 1)
                {
                    // if the frq is 1 remove from the hm
                    hm.remove(b.charAt(i));
                }
                // else
                else{
                    hm.put(b.charAt(i), hm.get(b.charAt(i))-1);
                }
            }
            // if the key is not present 
            else
            {
                return false;
            }
        }
        return hm.isEmpty();
    }
}