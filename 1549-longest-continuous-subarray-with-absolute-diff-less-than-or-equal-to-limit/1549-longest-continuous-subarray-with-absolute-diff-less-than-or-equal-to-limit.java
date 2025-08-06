class Solution {
    public int longestSubarray(int[] nums, int limit) {
         // code here
        int s = 0 ,e = 0;
        int n = nums.length;
        int maxl = 0;
        // 2 deque for the min and the max storage
        Deque<Integer> min = new LinkedList<>();
        Deque<Integer> max = new LinkedList<>();
        // loop while e<n 
        while(e < n )
        {
            /// insert in  max and min
            //store the min and  the max
            while(!min.isEmpty() && nums[e] < nums[min.peekLast()])
            {
                // remove from the last
                min.pollLast();

            }// else add the the last
            min.offerLast(e);
            // for the max 
            while(!max.isEmpty() && nums[e] > nums[max.peekLast()])
            {
                // remove from the last
                max.pollLast();

            }// else add the the last
            max.offerLast(e);

            // now we will get the min and the max
            // from the front of the deque
            int mi = nums[min.getFirst()];
            int ma = nums[max.getFirst()];



            // check the current window
            // now when the max -min > limit then we will uodate the start 
            while(ma - mi > limit)
            {
                // now remove the s fromt he current window
                if(min.peekFirst() == s) min.pollFirst();
                 if(max.peekFirst() == s) max.pollFirst();
                // update the s
                s++;
                // update the min and the max
                if(!min.isEmpty())mi = nums[min.getFirst()];
                if(!max.isEmpty())ma = nums[max.getFirst()];
            
            }

            // now  update the distace
            if(e-s+1 > maxl)
            {
                maxl = e-s+1;

            }
            // for the else case update the end
            e++;
        }
        return maxl;
    }
}