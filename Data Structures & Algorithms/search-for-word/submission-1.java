class Solution {
    private boolean used[][];
    private int ROWS;
    private int COLS;
    public boolean exist(char[][] board, String word) {
        ROWS = board.length;
        COLS = board[0].length;
        used = new boolean[ROWS][COLS];

        for(int r = 0; r < ROWS; r++){
            for(int c = 0; c < COLS; c++){
                if(backtrack(board, word, r, c, 0)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean backtrack(char[][] board, String word, int r, int c, int i){
        if(i == word.length()){
            return true;
        }

        if(r < 0 || c < 0 || r >= ROWS || c >= COLS || board[r][c] != word.charAt(i) || used[r][c]){
            return false;
        }

        used[r][c] = true;
        boolean res = backtrack(board, word, r + 1, c, i + 1) ||
        backtrack(board, word, r - 1, c, i + 1) ||
        backtrack(board, word, r, c + 1, i + 1) ||
        backtrack(board, word, r, c - 1, i + 1);

        used[r][c] = false;

        return res;
    }
}
