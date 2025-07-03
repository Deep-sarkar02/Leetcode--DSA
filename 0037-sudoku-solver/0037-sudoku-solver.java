class Solution {

    public boolean issafe(char[][] mat , int row, int col ,char c ) {
        for(int i = 0 ; i < 9 ; i++) {
            if(mat[row][i] == c || mat[i][col] == c)
                return false;
        }

        int strow = (row / 3) * 3;
        int stcol = (col / 3) * 3;

        for(int i = strow ; i < strow + 3 ; i++) {
            for(int j = stcol ; j < stcol + 3 ; j++) {
                if(mat[i][j] == c)
                    return false;
            }
        }

        return true;
    }

    public boolean helper(char[][] mat , int row, int col) {
        if(row == 9)
            return true;

        int newrow = row;
        int newcol = col + 1;
        if(newcol == 9) {
            newrow = row + 1;
            newcol = 0;
        }

        if(mat[row][col] != '.') {
            return helper(mat, newrow, newcol);
        }

        for(int i = 1; i <= 9; i++) {
            char ch = (char)('0' + i);
            if(issafe(mat, row, col, ch)) {
                mat[row][col] = ch;
                if(helper(mat, newrow, newcol)) return true;
                mat[row][col] = '.'; // backtrack
            }
        }

        return false;
    }

    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);

        // Optional print for checking the board
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
