/*
 * @lc app=leetcode id=1342 lang=java
 *
 * [1342] Number of Steps to Reduce a Number to Zero
 */

// @lc code=start
class Solution {
    public int numberOfSteps (int num) {
        int step = 0;
        while(num>0){
            if(num%2==0){
                num/=2;
            }
            else num-=1;
            step++;
        }
        return step;
    }
}
// @lc code=end

