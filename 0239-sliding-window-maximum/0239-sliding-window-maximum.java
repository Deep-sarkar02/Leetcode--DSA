class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
         // code here
        // form a deque for the data storing
        ArrayList<Integer> ans = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();
        // loop over the k size for the 1st windoe
        for(int i = 0 ; i <k ; i++)
        {
            // check from the last
            // 
            while(!dq.isEmpty() && nums[dq.getLast()] <=  nums[i])
            {
                //System.out.println("in while");
                // pop from the deque
                dq.removeLast();
            }
            // after the loop push
            // from last
            dq.addLast(i);
            //System.out.println(dq);
        }
        
        // for the next windows
        for(int i = k ; i <nums.length ; i++)
        {
            // System.out.println("++++++++++++++++++++++++");
            // System.out.println("for i ="+i);
            // now store the front of thedeque to the ans
            ans.add(nums[dq.getFirst()]);
            // System.out.println("=========");
            // System.out.println(ans);
            // System.out.println("=========");
            
            
            
            // remove the elem which are not the part of the current windoe
            while(!dq.isEmpty() && dq.getFirst() <= i-k) // condition written in the copy
            {
                // pop from the dq
                // pop from the front 
                dq.removeFirst();
                //System.out.println("dq  is :-"+dq);
            }
            
            // same logic copied from the above to  push to the dq
            while(!dq.isEmpty() && nums[dq.getLast()] <= nums[i])
            {
                // pop
                // from the back
                dq.removeLast();
            }
            // now push to the dq from the last
            dq.addLast(i);
            //System.out.println("dq  is :-"+dq);
            //System.out.println("++++++++++++++++++++++++++");
            // add the first elem to the ans
        
            
        }
        // // add the first elem to the ans
        // ans.add(arr[dq.getFirst()]);
        // System.out.println("ans-"+ans);
        ans.add(nums[dq.getFirst()]);
        //System.out.println("ans-"+ans);
        // now copy the ans to the array
        int arr[] = new int [ans.size()];
        for(int i = 0 ; i< arr.length ; i++)
        {
            arr[i] = ans.get(i);
        }

        
        
        return arr;
    }
}