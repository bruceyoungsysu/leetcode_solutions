/*
 * @lc app=leetcode id=1323 lang=java
 *
 * [1323] Maximum 69 Number
 */

// @lc code=start
class Solution {
    public int maximum69Number (int num) {
        int back = num;
        int digit = 1;
        int buff = 0;
        while(num>0){
            int remaining = num%10;
            if(remaining==6) buff = digit;
            num /= 10;
            digit*=10;
        }
        return back+3*buff;
    }
}
// @lc code=end

