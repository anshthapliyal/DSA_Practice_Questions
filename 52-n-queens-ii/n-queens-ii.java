class Solution {
    boolean board[][];
    public int totalNQueens(int n){  
        board = new boolean[n][n]; //fill with false
        return helper(0, n);
    }
    boolean willPlaceAQueen(int row, int col){
        //above row check
        for(int i = row;i>=0;i--){
            if(board[i][col]){
                return false;
            }
        }
        //left upper diagonal
        for(int i = row, j= col;i>=0 && j>=0; i--,j--){
            if(board[i][j]){
                return false;
            }
        }
        //right upper diagonal
        for(int i = row,j=col; i>=0 && j<board[0].length; i--, j++){
            if(board[i][j]){
                return false;
            }
        }
        return true;

    }
    int helper(int row, int n)
    {
        if(row ==n){
            return 1;
        }
        int count = 0;
        for(int col = 0; col<n; col++)
        {
            if(willPlaceAQueen(row, col)){
                //place the queen
                board[row][col] = true;
                count = count + helper(row+1, n);
                //backtrack(stack fall)
                board[row][col] = false;
            }
        }
        return count;
    }
}