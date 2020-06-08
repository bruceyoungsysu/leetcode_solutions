/*
 * @lc app=leetcode id=1359 lang=java
 *
 * [1359] Count All Valid Pickup and Delivery Options
 */

// @lc code=start
class Solution {
    public int countOrders(int n) {
        long res = 1;
        for(int i=2;i<=n;i++){
            long spaces = (i-1)*2;
            long sum = (1+spaces+1)/2*(spaces+1);
            res = res*sum%1000000007;
        }
        return (int)res;
        
    }
}
// @lc code=end

