class Solution {
    public List<Integer> majorityElement(int[] arr) {
        List<Integer>l = new ArrayList<>();
        HashMap <Integer , Integer> hm = new HashMap<>();
        // store in the hm
        for(int i = 0 ; i <arr.length ; i++)
        {
            if(hm.containsKey(arr[i]))
            {
                hm.put(arr[i], hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i], 1);

            }
            // sshorthand
            // get or default mens --> if the value of the key  is present it will return
            // else it will return 0 
            // the we will put +1 with that

            // hm.put(arr[i],hm.getOrDefault(arr[i], 0)+1);
        }

        // now loop over the key set
        Set<Integer> keyset = hm.keySet();
        // loop over the ks
        for(Integer k : keyset)
        {
            // show that keys that have ferq > n/3
            if(hm.get(k) >arr.length/3)
            {
                l.add(k);
            }
        }
    return l;
    }
}