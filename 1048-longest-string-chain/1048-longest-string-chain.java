class Solution {
    public int longestStrChain(String[] arr) {
        Arrays.sort(arr , Comparator.comparingInt(String :: length));
        //  now create a hashmap of key string and integer value
        HashMap<String , Integer> h = new HashMap<>();
        // maxlength
        int maxlength = 1;
        //  now loop over eahc of the string from the array
        for(String w : arr)
        {
            // initla length of the string is 1
            int length = 1;  
            // now loop over each of the word
            for(int i = 0 ; i<w.length() ; i++)
            {
                // get the predecessor by removing thre ith index
                String pred = w.substring(0,i) + w.substring(i+1);
                // find if the pred is not in  the map
                if(h.containsKey(pred))
                {
                    length = Math.max(length ,h.get(pred)+1 );
                }
            }
            // else case
            h.put(w , length);
            
            // maxlen
            maxlength = Math.max(maxlength , length);
        }
        return maxlength;
    }
}