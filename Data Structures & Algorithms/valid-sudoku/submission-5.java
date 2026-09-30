class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, HashSet<Character>> rowMap = new HashMap<>();
        HashMap<Integer, HashSet<Character>> colMap = new HashMap<>();
        HashMap<Integer, HashSet<Character>> blockMap = new HashMap<>();

        for(int r = 0; r < board.length; r++){
            for(int c = 0; c < board[0].length; c++){
                char cur = board[r][c];
                if(cur == '.'){
                    continue;
                }

                if(rowMap.containsKey(r)){
                    if(rowMap.get(r).contains(cur)){
                        return false;
                    } else {
                        rowMap.get(r).add(cur);
                    }
                } else {
                    rowMap.put(r, new HashSet<>());
                    rowMap.get(r).add(cur);
                }

                if(colMap.containsKey(c)){
                    if(colMap.get(c).contains(cur)){
                        return false;
                    } else {
                        colMap.get(c).add(cur);
                    }
                } else {
                    colMap.put(c, new HashSet<>());
                    colMap.get(c).add(cur);
                }

                int block = ((r/3) * 3) + (c/3);
                if(blockMap.containsKey(block)){
                    if(blockMap.get(block).contains(cur)){
                        return false;
                    } else {
                        blockMap.get(block).add(cur);
                    }
                } else {
                    blockMap.put(block, new HashSet<>());
                    blockMap.get(block).add(cur);
                }
            }
        }

        return true;
    }
}
