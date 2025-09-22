class Solution {
    public int candy(int[] arr) {
        int cnt =0 ; 
        int n = arr.length;
        int c [] = new int[n];
        for(int i = 0 ; i < n ; i ++)
        {
            c[i] = 1;// min 1
        }
        // now for basis of rating we will put 1 extra
        for(int i = 1 ; i <n ; i++)
        {
            if(arr[i] > arr[i-1])
            {
                c[i] = c[i-1]+1;
            }
        }
        // now we will do the same from the end
        for(int i = n-1 ; i > 0 ; i--)
        {
            // if the rating of the neighbour is more
            if(arr[i-1] > arr[i])
            {
                // check for the max candies for the i-1 index
                // c[i] + 1 
                // c[i-1]
                c[i-1]  = Math.max(c[i]+1 , c[i-1]);// both max
            }
            cnt += c[i-1];
        }
        return cnt + c[n-1];
    }
}