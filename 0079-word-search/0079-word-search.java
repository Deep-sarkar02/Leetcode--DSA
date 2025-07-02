class Solution {
    public boolean helper(String s, char[][] mat , int i , int row , int col , boolean[][] visted)
    {
        // base case
        if(i == s.length())
        {
            return true;
        }
        // another invalid and the other case
        if(row >= mat.length || col >= mat[0].length || row < 0 || col < 0 || visted[row][col] || mat[row][col] != s.charAt(i) )
        {
            return false;
        }
        // we will marks visited
        visted[row][col] = true;
        // now for each eleme we will call for th up down right and left
        // and we will return the valie
        boolean found = helper(s , mat , i+1 ,row+1 , col ,visted)||
                        helper(s , mat , i+1 ,row-1 , col ,visted)||
                        helper(s , mat , i+1 ,row , col+1 ,visted) ||
                        helper(s , mat , i+1 ,row , col-1 ,visted) ; 

        // backtract
        visted[row][col] = false;
        return found;
     }
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        // we will loop over the arry and if the first elemnt of the array matches then call for the next
        for(int i  = 0 ; i <row ; i++)
        {
            for(int j = 0 ; j<col ; j++)
            {
                // if matches
                if(board[i][j] == word.charAt(0))
                {
                    boolean[][] visited = new boolean[row][col];
                    // call the funtion witht the 0 th element
                    if(helper(word,board , 0 , i , j , visited))
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}