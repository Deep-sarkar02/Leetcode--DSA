class Solution {
    public int diagonalSum(int[][] mat) 
    {
        int sum = 0;
        for(int i = 0 ; i< mat.length ; i++)
        {
            // ps
            sum += mat[i][i];
            // for the overlapping case
            // for the odd no. of array
            if(i!=(mat.length-1) - i)
            {
                sum += mat[i][(mat.length-1)-i];
            }
        } 
        return sum;  
    }
}