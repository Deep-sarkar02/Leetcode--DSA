class Solution {
    public int[] intersection(int[] a, int[] b) 
    {
        HashSet<Integer>hs = new HashSet<>();
        ArrayList<Integer> d = new ArrayList<>();
        for(int i : a)
        {
            hs.add(i);
        }
        // now we will loop ovber the b and check if i is present in the a
        int c = 0;
        for(int j : b)
        {
            if(hs.contains(j))
            {
                c++;
                hs.remove(j);
                d.add(j);
            }
        } 
        // now create the array for d
        int [] arr = new int[d.size()];
        for(int i = 0 ; i <d.size() ; i++)
        {
            arr[i] = d.get(i);
        }   
        return arr;
    }
}