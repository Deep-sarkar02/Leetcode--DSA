class Solution {
    public boolean helper(int arr[] , int days , int possible_capacity)
    {
        // initially count and the sum is 1 and ele 1
        // for daily how much weights are carrying so we have sum 
        int sum = arr[0];
        // for day count we need count variable
        int count = 1;
        // now loop over the array
        // since 0 the elm is in the sum so it will start from 1
        for(int i =1; i<arr.length ; i++)
        {
            // we will find the sum for each of the cases
            sum += arr[i];
            // now check the sum < capacity if low then ok else call the nest ship
            if(sum > possible_capacity)
            {
                //increse the count
                count++;
                //  for the nxt day we will make the sum start from the next number
                sum = arr[i];
            }
        }
        // check if count<= days value
        // then true
        return (count<= days);

    }
    public int shipWithinDays(int[] weights, int days) {
        // we have to find out the min of the max weights , so we need to find the max weights
        // if day = 1 then max weights =  sum of all the number of arra
        // if days = total no. of element in the array  , so the max is the max(array elem)
        // so we have got a range of max 

        // find  the max value and sum of all the elem of the array
        int maxVal = 0;
        int sum = 0;
        for (int i = 0 ; i <weights.length ; i++)
        {
            if(weights[i] >  maxVal)
            {
                maxVal = weights[i];
            }
            sum += weights[i];
        }

        // now we will run a loop between the  max val and the total sum of elem 
        // and do the binary search 
        int low = maxVal;
        int high  = sum;
        // to store the ans
        int ans = -1;
        while(low <= high)
        {
            // find the mid
            int mid = low+(high - low)/2;
            //now pass the mid to the helper function 
            if (helper(weights, days , mid))// check sthat if this mid is possible no.
            {
                // if ok then 
                // store it to the ans
                ans = mid;
                // now we will look for lower max
                high = mid-1;
            }
            else
            {
                // we look for max
                low = mid+1;
            }
        
        }
        return ans;
    }
}