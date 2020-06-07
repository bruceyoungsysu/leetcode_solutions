import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/*
 * @lc app=leetcode id=1353 lang=java
 *
 * [1353] Maximum Number of Events That Can Be Attended
 */

// @lc code=start
class Solution {
    public int maxEvents(int[][] events) {
        // Arrays.sort(events, (a, b) -> a[1] == b[1] ? a[0] - b[0] : a[1] - b[1]);
        // Set<Integer> set = new HashSet<>();
        // for (int[] e : events) 
        //     for (int i = e[0]; i <= e[1]; i++) if (set.add(i)) break;
        // return set.size();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Arrays.sort(events, (a,b)->Integer.compare(a[0], b[0]));
        int i=0, res = 0, n = events.length;
        for(int d=1; d<=100000; d++){
            while(!pq.isEmpty() && pq.peek()<d){
                pq.poll();
            }
            while(i<n && events[i][0] == d){
                pq.add(events[i][1]);
                i++;
            }
            if(!pq.isEmpty()){
                pq.poll();
                res++;
            }
        }
        return res;
    }
}
// @lc code=end

