class Solution {
    static boolean canIPlaceValue(char[][] board,int row, int col, char val){
        // Check value in a row
        for(int i = 0 ; i<board.length; i++){
            if(board[row][i]== val){
                return false;
            }
            
        // check value in a column
            if(board[i][col]==val){
                return false;
            }
        }
        // check value in a sub grid
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for(int i = startRow; i<startRow+3; i++){
            for(int j = startCol; j<startCol+3 ; j++){
                if(board[i][j]== val){
                    return false;
                }
            }
        }
        return true;
    }



    static boolean solver(char[][] board,int row, int col){
        
        // Before Going in 1 to 9 Option Check that cell must be empty
        
        if(col == board.length){
            col = 0;
            row = row + 1;
        }
        if(row == board.length){
            return true;
        }
        if(board[row][col]!='.'){
            return  solver(board,row, col+1);
        }
        // There willbe a loop for 1 to 9 possiblity
        for(char value = '1'; value<='9' ; value++){
            if(canIPlaceValue(board,row, col, value)){
                // Now value can be place 
                board[row][col] = value; // Place at cell
                boolean result  =  solver(board,row, col+1);
                if(result){
                    return true;
                }
                board[row][col] = '.'; // BackTracking
            }
        }
        return false;
    }
    public void solveSudoku(char[][] board) {
        solver(board, 0, 0);
        
    }
}