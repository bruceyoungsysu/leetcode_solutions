/*
 * @lc app=leetcode id=1289 lang=java
 *
 * [1289] Minimum Falling Path Sum II
 */

// @lc code=start
class Solution {
    public int minFallingPathSum(int[][] arr) {
        int m = arr.length, n = arr[0].length;
        int[][] dp = new int[m][n];

        for(int j=0; j<n; j++){
            dp[0][j] = arr[0][j];
        }

        for(int i=1; i<m; i++){
            for(int j=0; j<n; j++){
                dp[i][j] = Integer.MAX_VALUE;
                for(int k = 0; k<n; k++){
                    if(k != j){
                        dp[i][j] = Math.min(dp[i][j], dp[i-1][k]+arr[i][j]);
                    }
                }
            }
        }
        int ans = dp[m-1][0];

        for(int j=1; j<n; j++){
            ans = Math.min(ans, dp[m-1][j]);
        }
        return ans;
        
    }
}
// @lc code=end

