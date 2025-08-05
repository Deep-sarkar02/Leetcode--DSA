class Solution {
    public int findLongestChain(int[][] pairs) {
        // sort the pairs based on the 2nd number
        Arrays.sort(pairs , Comparator.comparingDouble(o ->o[1]));

        // define the ans
        // for the 0 th pair
        int ans = 1;
        int lastend = pairs[0][1];

        // now find for the other indedx
        for(int i =0 ; i<pairs.length ; i++)
        {
            // compare if the start is > than the chain end
            if(pairs[i][0] > lastend)
            {
                // update all
                ans++;
                // update the lastend
                lastend = pairs[i][1];
            }
        }
        return ans;
    }
}