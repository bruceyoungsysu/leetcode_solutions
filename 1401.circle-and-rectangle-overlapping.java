import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * @lc app=leetcode id=1401 lang=java
 *
 * [1401] Circle and Rectangle Overlapping
 */

// @lc code=start
class Solution {
    public boolean checkOverlap(int radius, int x_center, int y_center, int x1, int y1, int x2, int y2) {
        if(x_center>=x1 && x_center<=x2 && y_center>=y1 && y_center<=y2) return true;
        int[][] points = new int[][]{{x1,y1},{x2,y2},{x1,y2},{x2,y1}};
        List<int[]> ps = new ArrayList<>();
        Collections.addAll(ps, points);
        if(x_center>x1 && x_center<x2){
            ps.add(new int[]{x_center, y1});
            ps.add(new int[]{x_center, y2});
        }
        if(y_center>y1 && y_center<y2){
            ps.add(new int[]{x1, y_center});
            ps.add(new int[]{x2, y_center});
        }
        for(int[] p:ps){
            int x=p[0],y=p[1];
            if((x-x_center)*(x-x_center)+(y-y_center)*(y-y_center)<=radius*radius) return true;
        }
        return false;
    }
}
// @lc code=end

