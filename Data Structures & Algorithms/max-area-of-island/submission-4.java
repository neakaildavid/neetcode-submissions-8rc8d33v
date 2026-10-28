class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int area = 0;
        for(int r = 0; r < grid.length; r++){
            for(int c = 0; c < grid[0].length; c++){
                if(grid[r][c] == 1){
                    int curArea = dfs(r, c, grid, 0);
                    area = Math.max(area, curArea);
                }
            }
        }

        return area;
    }

    public int dfs(int row, int col, int[][] grid, int area){
        if(row >= grid.length || row < 0 || col >= grid[0].length || col < 0){
            return area;
        }

        if(grid[row][col] == 0){
            return area;
        }

        int curArea = area;
        if(grid[row][col] == 1){
            curArea++;
            grid[row][col] = 0;
        }

        curArea = dfs(row + 1, col, grid, curArea);
        curArea = dfs(row - 1, col, grid, curArea);
        curArea = dfs(row, col + 1, grid, curArea);
        curArea = dfs(row, col - 1, grid, curArea);
        return curArea;
    }
}
