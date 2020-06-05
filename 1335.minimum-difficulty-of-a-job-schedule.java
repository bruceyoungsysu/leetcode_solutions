/*
 * @lc app=leetcode id=1335 lang=java
 *
 * [1335] Minimum Difficulty of a Job Schedule
 */

// @lc code=start
class Solution {
    public int minDifficulty(int[] jobDifficulty, int d) {
        int n = jobDifficulty.length;
        if(n<d) return -1;
        int[][] dp = new int[d][n];
        dp[0][0] = jobDifficulty[0];
        for(int i=1; i<n; i++){
            dp[0][i] = Math.max(dp[0][i-1], jobDifficulty[i]);
        }

        for(int i=1;i<d;i++){
            for(int j=i;j<n;j++){
                int localMax = jobDifficulty[j];
                dp[i][j] = Integer.MAX_VALUE;
                for(int r=j;r>=i;r--){
                    localMax = Math.max(localMax, jobDifficulty[r]);
                    dp[i][j] = Math.min(dp[i][j], dp[i-1][r-1]+localMax);
                }
            }
        }
        return dp[d-1][n-1];

    }
}
// @lc code=end

