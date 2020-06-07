/*
 * @lc app=leetcode id=1344 lang=java
 *
 * [1344] Angle Between Hands of a Clock
 */

// @lc code=start
class Solution {
    public double angleClock(int hour, int minutes) {
        double h = hour*30+30*minutes/60.0;
        double m = minutes*6;
        double diff = Math.abs(h-m);
        // System.out.println(h);
        // System.out.println(m);
        return Math.min(360-diff, diff);
    }
}
// @lc code=end

