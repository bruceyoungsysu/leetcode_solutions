import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/*
 * @lc app=leetcode id=1306 lang=java
 *
 * [1306] Jump Game III
 */

// @lc code=start
class Solution {
    public boolean canReach(int[] arr, int start) {
        Set<Integer> seen = new HashSet<>();
        Queue<Integer> front = new LinkedList<>();
        int n = arr.length;
        front.offer(start);
        while(!front.isEmpty()){
            int size = front.size();
            for(int i=0; i<size; i++){
                int f = front.poll();
                if(arr[f] == 0) return true;
                seen.add(f);
                int left = f-arr[f], right = f+arr[f];
                if(left>=0 && !seen.contains(left)) front.offer(left);
                if(right<n && !seen.contains(right)) front.offer(right);
            }
        }
        return false;
        
    }
}
// @lc code=end

