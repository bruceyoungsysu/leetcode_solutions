/*
 * @lc app=leetcode id=1411 lang=java
 *
 * [1411] Number of Ways to Paint N × 3 Grid
 */

// @lc code=start
class Solution {
    public int numOfWays(int n) {
        long a123=6, a121=6, mod = (long)1e9+7;
        for(int i=1; i<n; i++){
            long b121 = a121*3+a123*2;
            long b123 = a121*2+a123*2;
            a121 = b121%mod;
            a123 = b123%mod;
        }
        return (int)((a123+a121)%mod);
    }
}
// @lc code=end

