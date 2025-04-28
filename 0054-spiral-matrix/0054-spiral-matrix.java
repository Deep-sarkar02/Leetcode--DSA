class Solution {
    public List<Integer> spiralOrder(int[][] matrix) 
    {
        // Creating a List of integer using ArrayList
        List<Integer> li = new ArrayList<>();

        // start row , col , end row, col
        int startrow = 0;
        int endrow = matrix.length-1;
        int startcol = 0;
        int endcol  = matrix[0].length-1;

        while(startrow<=endrow && startcol <= endcol)
        {
            // top boundary print
            for(int j= startcol ; j <= endcol ; j++ )
            {
                li.add(matrix[startrow][j]);
            }
            // now we will print the right bounfdary
            for(int i = startrow +1 ; i<=endrow ; i++)
            {
                li.add(matrix[i][endcol]);
            }
            // print the bottom 
            for(int j = endcol -1 ; j >= startcol ; j--)
            {
                if(startrow == endrow)
                {
                    break;
                }
                li.add(matrix[endrow][j]);
            }
            // now for the left
            for(int i = endrow-1 ; i>=startrow +1 ; i--)
            {
                if(startcol == endcol)
                {
                    break;
                }
                li.add(matrix[i][startcol]);
            }
            endrow --;
            startrow++;
            startcol ++;
            endcol--;
        }   
        return li;
    }
}