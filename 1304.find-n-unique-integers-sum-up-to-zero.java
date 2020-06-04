/*
 * @lc app=leetcode id=1304 lang=java
 *
 * [1304] Find N Unique Integers Sum up to Zero
 */

// @lc code=start
class Solution {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        int start = n/2;
        int i = 0;
        while(start>0){
            res[i++] = start;
            res[i++] = -start;
            start--;
        }
        return res;
        
    }
}
// @lc code=end

