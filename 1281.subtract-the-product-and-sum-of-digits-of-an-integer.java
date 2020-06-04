/*
 * @lc app=leetcode id=1281 lang=java
 *
 * [1281] Subtract the Product and Sum of Digits of an Integer
 */

// @lc code=start
class Solution {
    public int subtractProductAndSum(int n) {
        int product=1, sum = 0;
        int mask = 10;
        while(n>0){
            int digit = n%mask;
            product *= digit;
            sum += digit;
            n /= 10;
        }
        return product - sum;
    }
}
// @lc code=end

