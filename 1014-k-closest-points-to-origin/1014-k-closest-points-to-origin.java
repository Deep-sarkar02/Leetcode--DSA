class Solution {
    public int[][] kClosest(int[][] points, int k) {
        // create a pq
        PriorityQueue<int []>pq = new PriorityQueue<>((a ,b)->Integer.compare(b[0] , a[0]));
        // now we will loop over the array and fid the dits
        for(int i = 0 ; i < points.length ; i++)
        {
            int dist = points[i][0]*points[i][0] + points[i][1]*points[i][1];
            // now we will addd the data to the pq
            pq.add(new int[]{dist , i});
            // case
            if(pq.size() > k)
            {
                pq.poll();
            }
        }
        // now  create the ans
        int [][] ans = new int [k][2];
        int ind = 0;
        while(! pq.isEmpty())
        {
            ans[ind] = points[pq.poll()[1]];
            ind++;
        }
        return ans;
        
    }
}