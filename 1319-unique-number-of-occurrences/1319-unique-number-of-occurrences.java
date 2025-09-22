import java.util.*;
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer , Integer> ht = new HashMap<>();
        for(int i = 0 ; i <arr.length ; i ++)
        {
            // we will put the value in the ht
            // if the key is in teh tablea ++
            if(ht.containsKey(arr[i]))
            {
                ht.put(arr[i] , ht.get(arr[i])+1);
            }
            else
            {
                ht.put(arr[i] , 1);
            }
        }
        //now get the value s
        Collection<Integer> v = ht.values();
        // now vovert the value sto valset
        Set<Integer> vs = new HashSet<>(ht.values());
        // now check the size of both
        return v.size() == vs.size();
    }
}