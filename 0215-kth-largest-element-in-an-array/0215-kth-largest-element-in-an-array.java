class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int num:nums) {
            
            q.add(num);
           

        }
        //System.out.println(q);
        
          //System.out.println(q.poll());
        int c = 0;
        while(c < k-1)
        {
            q.poll();
            c++;
        }
        return q.poll();
    }
}