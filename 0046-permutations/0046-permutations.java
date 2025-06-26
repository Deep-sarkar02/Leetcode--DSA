class Solution {

    public void getparam(int [] s , int idx ,List<List<Integer>>as ) // we will returing the nested list
    {
        // base case
        if(idx == s.length)
        {
            // now we will create a new arrayList
            // since we need an array then we will push the full array to the list of list
            ArrayList<Integer> r = new ArrayList<>();
            // we will traverse the each element from the arrya and put it to the array list
            for (int i : s)
            {
                r.add(i);
            }

            // now we will put the full array to the list
            as.add(r);
            return;
        }


        // loop 
        for(int i = idx; i<s.length; i++)
        {
            // get the value of the string
            // pass the array , index of swap
            swap(s , idx , i); // now for the index we will be swapping
            // call the function for idx+1
            getparam(s , idx+1 , as);
            // backtrack
            swap(s , idx ,i);
        }
    }
    public void swap(int [] s , int idx , int i)
    {
        int temp = s[idx];
        s[idx] = s[i];
        s[i] = temp;
    }




    // main retutrning function
    public List<List<Integer>> permute(int[] nums) 
    {
        List<List<Integer>> as = new ArrayList<>();
        getparam(nums , 0 , as );
        return as;
    }
}