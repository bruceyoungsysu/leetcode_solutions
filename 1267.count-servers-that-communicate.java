/*
 * @lc app=leetcode id=1267 lang=java
 *
 * [1267] Count Servers that Communicate
 */

// @lc code=start
class Solution {
    private int res = 0;
    public int countServers(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for(int i=0; i<m; i++){
            for(int j = 0; j<n; j++){
                dfs(i,j, grid);
            }
        }
        return res;
        
    }

    private void dfs(int x, int y, int[][] grid){
        if(grid[x][y]==2 || grid[x][y]==0) return;
        for(int i=0; i<grid.length; i++){
            if(i!=x && grid[i][y]>0){
                res++;
                grid[x][y]= 2; 
                return;
            }
        }
        for(int j=0; j<grid[0].length; j++){
            if(j!=y&& grid[x][j]>0){
                res++;
                grid[x][y] = 2;
                return;
            }
        }
    }
}
// @lc code=end

