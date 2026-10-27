class Solution {
    public int numIslands(char[][] grid) {
        int islands = 0;
        for(int r = 0; r < grid.length; r++){
            for(int c = 0; c < grid[0].length; c++){
                if(grid[r][c] == '1'){
                    islands++;
                    dfs(r, c, grid);
                }
            }
        }

        return islands;
    }

    public void dfs(int row, int col, char[][] grid){
        if(row >= grid.length || row < 0 || col >= grid[0].length || col < 0 ){
            return;
        }
        if(grid[row][col] == '0'){
            return;
        }
        if(grid[row][col] == '1'){
            grid[row][col] = '0';
        }

        dfs(row + 1, col, grid);
        dfs(row - 1, col, grid);
        dfs(row, col + 1, grid);
        dfs(row, col - 1, grid);
    }
}
