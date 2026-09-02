class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int r = 0; r < board.length; r++){
            HashSet<Character> rowNums = new HashSet<Character>();
            for(int c = 0; c < board[0].length; c++){
                Character cur = board[r][c];
                if(cur != '.'){
                    if(rowNums.contains(cur)){
                        return false;
                    } else {
                        rowNums.add(cur);
                    }
                }
            }
        }

        for(int c = 0; c < board[0].length; c++){
            HashSet<Character> colNums = new HashSet<Character>();
            for(int r = 0; r < board.length; r++){
                Character cur = board[r][c];
                if(cur != '.'){
                    if(colNums.contains(cur)){
                        return false;
                    } else {
                        colNums.add(cur);
                    }
                }
            }
        }
        int row = 0;
        int col = 0;
        for(int i = 0; i < 9; i++){
            if(col >= board[0].length){
                col = 0;
                row += 3;
            }

            if(!checkBlock(board, row, col)){
                return false;
            }

            col += 3;
        }
        return true;
    }

    public boolean checkBlock(char[][] board, int row, int col){
        HashSet<Character> blockNums = new HashSet<Character>();

        for(int r = row; r < row + 3; r++){
            for(int c = col; c < col + 3; c++){
                Character cur = board[r][c];
                if(cur != '.'){
                    if(blockNums.contains(cur)){
                        return false;
                    } else {
                        blockNums.add(cur);
                    }
                }
            }
        }

        return true;
    }
}
