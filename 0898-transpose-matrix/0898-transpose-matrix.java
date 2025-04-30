class Solution {
    public int[][] transpose(int[][] matrix) 
    {
        // now we will create a new ans matrix of row =  col and col = row
        int row = matrix.length;
        int col = matrix[0].length;
        int ans[][] = new int[col][row];
        for( int r =0 ; r<=matrix.length-1 ; r++)
        {
            for( int c=0 ; c<=matrix[0].length-1 ; c++)
            {
                ans[c][r] = matrix[r][c];
            }
        }  
        return ans; 
    }
}