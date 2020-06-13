/*
 * @lc app=leetcode id=1406 lang=java
 *
 * [1406] Stone Game III
 */

// @lc code=start
class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;
        int[] suffixSum = new int[n+1];
        int[] dp = new int[n+1];
        for(int i=n-1; i>=0; i--){
            suffixSum[i] = suffixSum[i+1]+stoneValue[i];
        }
        for(int i=n-1; i>=0; i--){
            // value of pick first at i
            dp[i] = stoneValue[i] + suffixSum[i+1]-dp[i+1];
            for(int k=i+1; k<i+3 && k<n; k++){
                dp[i] = Math.max(dp[i], suffixSum[i]-dp[k+1]);
            }
        }
        if(dp[0]*2>suffixSum[0]) return "Alice";
        else if(dp[0]*2<suffixSum[0]) return "Bob";
        return "Tie";
    }
}
// @lc code=end

