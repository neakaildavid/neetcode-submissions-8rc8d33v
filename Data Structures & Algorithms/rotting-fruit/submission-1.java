class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new ArrayDeque<>();
        int ROWS = grid.length;
        int COLS = grid[0].length;
        int numFresh = 0;
        for(int r = 0; r < ROWS; r++){
            for(int c = 0; c < COLS; c++){
                if(grid[r][c] == 2){
                    q.offer(new int[]{r, c});
                } else if (grid[r][c] == 1){
                    numFresh++;
                }
            }
        }

        int[][] dirs = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        int mins = 0;
        while(!q.isEmpty()){
            int size = q.size();
            boolean foundHere = false;
            for(int i = 0; i < size; i++){
                int[] node = q.poll();
                int row = node[0];
                int col = node[1];
                for(int[] d : dirs){
                    int nr = row + d[0];
                    int nc = col + d[1];
                    if(nr >= ROWS || nr < 0 || nc >= COLS || nc < 0 || grid[nr][nc] != 1){
                        continue;
                    }

                    grid[nr][nc] = 2;
                    numFresh--;
                    foundHere = true;
                    q.offer(new int[]{nr, nc});
                }
            }

            if(foundHere){
                mins++;
            } else {
                break;
            }
        }
        if(numFresh == 0){
            return mins;
        } else {
            return -1;
        }
    }
}
