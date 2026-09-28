class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, HashSet<Character>> rowHash = new HashMap<>();
        HashMap<Integer, HashSet<Character>> colHash = new HashMap<>();
        HashMap<Integer, HashSet<Character>> blockHash = new HashMap<>();

        for(int r = 0; r < board.length; r++){
            for(int c = 0; c < board[0].length; c++){
                if(board[r][c] >= '1' && board[r][c] <= '9'){
                    rowHash.computeIfAbsent(r, key -> new HashSet<>());
                colHash.computeIfAbsent(c, key -> new HashSet<>());
                blockHash.computeIfAbsent((r/3)*3 + (c/3), key -> new HashSet<>());

                if(rowHash.get(r).contains(board[r][c])){
                    return false;
                }

                if(colHash.get(c).contains(board[r][c])){
                    return false;
                }

                if(blockHash.get((r/3)*3 + (c/3)).contains(board[r][c])){
                    return false;
                }

                rowHash.get(r).add(board[r][c]);
                colHash.get(c).add(board[r][c]);
                blockHash.get((r/3)*3 + (c/3)).add(board[r][c]);
                }
            }
        }

        return true;
    }
}
