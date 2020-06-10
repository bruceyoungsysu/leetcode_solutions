import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/*
 * @lc app=leetcode id=1376 lang=java
 *
 * [1376] Time Needed to Inform All Employees
 */

// @lc code=start
class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        Queue<int[]> front = new LinkedList<>(); // (node, time used)
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0; i<n; i++){
            int mgr = manager[i];
            map.putIfAbsent(mgr, new ArrayList<>());
            map.get(mgr).add(i);
        }
        
        front.add(new int[]{headID, 0});
        int res = 0;
        while(!front.isEmpty()){
            int size = front.size();
            for(int i=0; i<size; i++){
                int[] top = front.poll();
                int time = informTime[top[0]];
                if(map.containsKey(top[0])){
                    for (int next : map.get(top[0])) {
                        int ncost = top[1]+time;
                        front.add(new int[]{next, ncost});
                        res = Math.max(res, ncost);
                    }
                }
            }
        }
        return res;
    }
}
// @lc code=end

