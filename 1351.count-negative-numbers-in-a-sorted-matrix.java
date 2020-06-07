/*
 * @lc app=leetcode id=1351 lang=java
 *
 * [1351] Count Negative Numbers in a Sorted Matrix
 */

// @lc code=start
class Solution {
    public int countNegatives(int[][] grid) {
        int res = 0;
        int m = grid.length, n = grid[0].length;
        int  i = 0, j = n-1;
        while(i<m && j>=0){
            if(grid[i][j]<0){
                res+= m-i;
                j--;
            }
            else{
                i++;
            }
        }
        return res;
    }
}
// @lc code=end

