class Solution {
    public int maxProfit(int[] arr) {
        int max = 0 ;
        // we will fidn the total profit
        for(int i = 0 ; i < arr.length-1 ; i++)
        {
            if(arr[i+1] > arr[i])
            {
                max+= arr[i+1] - arr[i];

            }
        }
        return max;
    }
}