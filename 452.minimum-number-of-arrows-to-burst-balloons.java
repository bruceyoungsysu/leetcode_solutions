import java.util.Arrays;

/*
 * @lc app=leetcode id=452 lang=java
 *
 * [452] Minimum Number of Arrows to Burst Balloons
 */

// @lc code=start
class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a,b)->{
            if(a[0]!=b[0]){
                return a[0]-b[0];
            }
            else{
                return a[1]-b[1];
            }
            
        });
        int start = 0;
        int res = 0;
        while(start<points.length){
            int left = points[start][0], right = points[start][1];
            int next = start+1;
            while(next<points.length && points[next][0]<=right && points[next][0]>=left){
                next++;
                left  = Math.max(left, points[next][0]);
                right = Math.min(right, points[next][1]);
            }
            start = next;
            res++;
        }
        return res;
    }
}
// @lc code=end

