class Solution {
    public int jump(int[] arr) {
          // code here
        int totaljump = 0 ;
        int  dest = arr.length -1;
        int cov = 0;
        int lastjumpidx = 0;
        
        // base case
        if(arr.length == 1) return 0; // for the single element
        // now loop over the array
        for(int i = 0 ; i < arr.length ; i++)
        {
            cov = Math.max(cov , i+ arr[i]);
            
            // now we chek that if the i == lastjumpidx
            if(i == lastjumpidx)
            {
                // update it with coverage
                lastjumpidx = cov;
                // update the total jump
                totaljump ++;
                
                // if the  total jump have crossed destination
                if(cov >= dest)
                {
                    return totaljump;
                }
            }
            if(i>= cov)
            {
                return -1;
            }
        }
        return -1;
    }
}