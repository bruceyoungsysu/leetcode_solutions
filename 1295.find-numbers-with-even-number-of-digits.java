/*
 * @lc app=leetcode id=1295 lang=java
 *
 * [1295] Find Numbers with Even Number of Digits
 */

// @lc code=start
class Solution {
    public int findNumbers(int[] nums) {
        int res = 0;
        for(int n:nums){
            if((n>=10 &&n<=99)||(n>=1000 && n<=9999) || (n>=100000)){
                res++;
            }
        }
        return res;
        
    }
}
// @lc code=end

