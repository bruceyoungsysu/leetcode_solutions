/*
 * @lc app=leetcode id=1266 lang=java
 *
 * [1266] Minimum Time Visiting All Points
 */

// @lc code=start
class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {

        if(points.length<=1) return 0;
        int prevx = points[0][0];
        int prevy = points[0][1];

        int res = 0;
        for(int i=1; i<points.length; i++){
            int curx = points[i][0];
            int cury = points[i][1];
            int dia = Math.min(Math.abs(curx-prevx), Math.abs(cury-prevy));
            int ver = Math.max(Math.abs(curx-prevx)-dia, Math.abs(cury-prevy)-dia);
            res += dia+ver;
            prevx = curx;
            prevy = cury;
        }
        return res;
        
    }
}
// @lc code=end

