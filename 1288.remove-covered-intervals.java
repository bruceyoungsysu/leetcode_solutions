import java.util.Arrays;
import java.util.Comparator;

/*
 * @lc app=leetcode id=1288 lang=java
 *
 * [1288] Remove Covered Intervals
 */

// @lc code=start
class Solution {
    class Sortbyname implements Comparator<int[]>{
        public int compare(int[] a, int[] b){
            if(a[0] != b[0]) return a[0]-b[0];
            else return b[1]-a[1];
        }
    }
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, new Sortbyname());
        int prevEnd = -1;
        int res = 0;
        for(int[] interval:intervals){
            if(interval[1]>prevEnd){
                res++;
                prevEnd = interval[1];
            }
        }
        return res;

        
    }
}
// @lc code=end

