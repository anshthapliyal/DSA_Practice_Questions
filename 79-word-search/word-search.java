class Solution {
    public boolean exist(char[][] board, String word) {
        // Traverse Each Cell of a Board
        for(int i = 0; i<board.length; i++){
            for(int j= 0 ; j<board[i].length; j++){
                if(isFound(board, word, i, j)){
                    return true;
                }
            }
        }
        return false;
    }
    int directions[][] = {{1, 0}, {0,1}, {-1,0}, {0,-1}};
    // isFound (Word Exist in a Board or not)
    boolean isFound(char[][] board, String word, int row, int col){
        // Base case
        if(word.length()==0){
            return true; 
        }
        // Negative base case
        if(row<0 || col<0 || col>=board[0].length || row>=board.length
         || board[row][col] != word.charAt(0)){
            return false;
        }

        // mark visited
        board[row][col] = '#'; // Mark Visited
        // Move in all directions
        boolean isMatch = false; // not correct result
        for(int direction=0; direction<directions.length; direction++){
            int nextRow = directions[direction][0];
            int nextCol = directions[direction][1];
            // recursive call
            isMatch = isFound(board, word.substring(1), row + nextRow, col + nextCol);
            if(isMatch){
                break;
            }
           
           
        }
         // stack fall (backtrack)
            // undo the #
         board[row][col] = word.charAt(0);
        return isMatch;
    }
}