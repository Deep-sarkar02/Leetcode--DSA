class Solution {
    // the function will take only the depth in th params
    public int nQueen(boolean[][] mat, int row)
    {
        // base case:
        // if one row fully is iterated then return
        if(row == mat.length)
        {
            return 1;
        }

        // use ans var to store the sum 
        int ans = 0;

        //now for each of the row , we will explore each of the colm
        for(int col = 0 ; col < mat.length  ; col++)
        {
            // we will check that the partcular col is safe or not 
            if(isSafe(mat , row ,col))
            {
                // mark visited that safe
                mat[row][col] = true;
                // now after placing at that colm value we will move to the next row and explore further
                // so call the recursion
                ans+= nQueen(mat , row+1);

                // after calling we will make the cell unvisited 
                mat[row][col] = false;
            }
        }
        // return 
        return ans;
    }
    public boolean isSafe(boolean[][] mat ,int r , int c)
    {
        int row;
        int col;
        // for up directions
        row = r;
        col = c;
        while(row>=0)
        {
            if(mat[row][col] == true)
            {
                return false;
            }
            row--;
        }
        // for upright
        row = r;
        col = c;
        while(row>=0 && col<mat.length)
        {
            if(mat[row][col] == true)
            {
                return false;
            }
            row--;
            col++;
        }

        //for upleft
        row = r;
        col = c;
        while(row>=0 && col>=0)
        {
            if(mat[row][col] == true)
            {
                return false;
            }
            row--;
            col--;
        }
        // if all these are ok then true
        return true;
    } 
    public int totalNQueens(int n) 
    {
     // make a boolean array 
     boolean[][] mat = new boolean[n][n];
     // now pass the array to and the inital row value to the recursion
     // here depth is the row , so it will be passd to the parameter
     // and breadth is the colm , so , it will be looped
     return nQueen(mat , 0);   
    }
}