class Solution {
    private int[][] dirs = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    private int ROWS;
    private int COLS;
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        ROWS = heights.length;
        COLS = heights[0].length;
        boolean[][] pac = new boolean[ROWS][COLS];
        boolean[][] atl = new boolean[ROWS][COLS];

        Queue<int[]> pacq = new ArrayDeque<>();
        Queue<int[]> atlq = new ArrayDeque<>();


        for(int c = 0; c < COLS; c++){
            pacq.offer(new int[]{0, c});
            atlq.offer(new int[]{ROWS - 1, c});
        }
        for(int r = 0; r < ROWS; r++){
            pacq.offer(new int[]{r, 0});
            atlq.offer(new int[]{r, COLS - 1});
        }

        bfs(pacq, pac, heights);
        bfs(atlq, atl, heights);

        List<List<Integer>> res = new ArrayList<>();
        for(int r = 0; r < ROWS; r++){
            for(int c = 0; c < COLS; c++){
                if(pac[r][c] && atl[r][c]){
                    List<Integer> cur = new ArrayList<>();
                    cur.add(r);
                    cur.add(c);
                    res.add(cur);
                }
            }
        }


        return res;
    }

    public void bfs(Queue<int[]> q, boolean[][] grid, int[][] heights){
        while(!q.isEmpty()){
            int[] node = q.poll();
            int r = node[0];
            int c = node[1];
            grid[r][c] = true;
            for(int[] d : dirs){
                int nr = r + d[0];
                int nc = c + d[1];
                if(nr >= ROWS || nr < 0 || nc >= COLS || nc < 0){
                    continue;
                }

                if(grid[nr][nc] == true || heights[nr][nc] < heights[r][c] ){
                    continue;
                }

                q.offer(new int[]{nr, nc});
            }
        }
    }
}
