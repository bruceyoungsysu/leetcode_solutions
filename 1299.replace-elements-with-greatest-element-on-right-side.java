/*
 * @lc app=leetcode id=1299 lang=java
 *
 * [1299] Replace Elements with Greatest Element on Right Side
 */

// @lc code=start
class Solution {
    public int[] replaceElements(int[] arr) {
        int N = arr.length;
        int[] res = new int[N];
        int curMax = -1;
        for(int i = N-1; i>=0; i--){
            res[i] = curMax;
            curMax = Math.max(curMax, arr[i]);
        }
        return res;
    }
}
// @lc code=end

