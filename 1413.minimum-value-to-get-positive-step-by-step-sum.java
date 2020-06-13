/*
 * @lc app=leetcode id=1413 lang=java
 *
 * [1413] Minimum Value to Get Positive Step by Step Sum
 */

// @lc code=start
class Solution {
    public int minStartValue(int[] nums) {
        int min = 0;
        int cur = 0;
        for(int num:nums){
            cur+=num;
            min = Math.min(min, cur);
        }
        return min<=0? 1-min:1;
        
    }
}
// @lc code=end

