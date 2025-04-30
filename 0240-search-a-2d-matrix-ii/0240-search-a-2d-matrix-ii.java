class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length -1;
        while( row >=0 && row <= matrix.length-1 && col>=0 && col<= matrix[0].length-1)
        {
            // check if the top right corner contains the key
            if(matrix[row][col] == target)
            {
                return true;
            }
            else if(matrix[row][col] > target)
            {
                // go to left 
                col--;
            }
            else
            {
                // move to bottom
                row++;
            }
            
        }
        // aftr the full search we will return 
        return false;
    }
}