class Solution {
    public void solve(char[][] board) {
        int ROWS = board.length;
        int COLS = board[0].length;
        int[][] dirs = new int[][]{{1,0}, {-1,0}, {0, 1}, {0, -1}};

        Queue<int[]> q = new ArrayDeque<>();
        for(int r = 0; r < ROWS; r++){
            if(board[r][0] == 'O'){
                q.offer(new int[]{r, 0});
            }

            if(board[r][COLS - 1] == 'O'){
                q.offer(new int[]{r, COLS - 1});
            }
        }

        for(int c = 1; c < COLS - 1; c++){
            if(board[0][c] == 'O'){
                q.offer(new int[]{0, c});
            }

            if(board[ROWS - 1][c] == 'O'){
                q.offer(new int[]{ROWS - 1, c});
            }
        }

        boolean[][] notSurrounded = new boolean[ROWS][COLS];

        while(!q.isEmpty()){
            int[] cur = q.poll();
            int r = cur[0];
            int c = cur[1];
            notSurrounded[r][c] = true;
            for(int[] d : dirs){
                int nr = r + d[0];
                int nc = c + d[1];

                if(nr >= ROWS || nr < 0 || nc >= COLS || nc < 0){
                    continue;
                }

                if(notSurrounded[nr][nc] || board[nr][nc] == 'X'){
                    continue;
                }

                q.offer(new int[]{nr, nc});
            }
        }

        for(int r = 0; r < ROWS; r++){
            for(int c = 0; c < COLS; c++){
                if(!notSurrounded[r][c]){
                    board[r][c] = 'X';
                }
            }
        }
    }
}
