class army implements  Comparable<army>
{
    int count ; 
    int idx;
    army(int c , int i)
    {
        this.count = c;
        this.idx = i;

    }

    @Override
    public int compareTo(army a)
    {
        // if both the count are equal then compare on basis of index
        if(this.count == a.count)
        {
            // compare on basis of index
            return this.idx - a.idx;
        } 
        else
        {
            //sort on the basis of the count
            return this.count - a.count;
        }
    }
}
class Solution {
    public int[] kWeakestRows(int[][] a, int k) {
        int [] arr = new int[k];
        PriorityQueue<army> pq = new PriorityQueue<>();
        // now store the data in to ps
        for(int i= 0 ; i <a.length ; i++)
        {
            // count the no. of soldires
            int count = 0 ;
            for(int j= 0 ; j<a[0].length ; j++)
            {
                if(a[i][j] == 1)
                {
                     count+=1;
                }
                else{
                    count+=0;
                }
            }
            // add to pq
            pq.add(new army(count, i)); // for each of the row
        }

        //now out the min rows
        for(int i = 0 ; i<k ; i++)
        {
            // System.out.println(pq.remove().idx);
            arr[i] =pq.remove().idx; 
        }
        return arr;
    }
}