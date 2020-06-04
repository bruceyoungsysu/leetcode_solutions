/*
 * @lc app=leetcode id=1317 lang=java
 *
 * [1317] Convert Integer to the Sum of Two No-Zero Integers
 */

// @lc code=start
class Solution {
    public int[] getNoZeroIntegers(int n) {
        int cur = n;
        int a = 0;
        int d = 1;
        while(cur>0){
            int rmn = cur%10;
            if(rmn == 1) {a+=2*d;cur-=2;}
            else {a+=d;cur--;}
            cur = cur/10;
            d*=10;
            if(cur<10) break;
        }
        return new int[]{a, n-a};
    }
}
// @lc code=end

