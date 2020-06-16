import java.util.Collections;
import java.util.PriorityQueue;

/*
 * @lc app=leetcode id=1439 lang=java
 *
 * [1439] Find the Kth Smallest Sum of a Matrix With Sorted Rows
 */

// @lc code=start
class Solution {
    public int kthSmallest(int[][] mat, int k) {
        // basically, push every combination into the pq col by col, if
        // pq has the size larger than k, then poll
        // use max pq, so poll the max value each time

        // keep the mini size of col
        int col = Math.min(k, mat[0].length);

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(0);
        for(int[] row: mat){
            PriorityQueue<Integer> cur = new PriorityQueue<>(Collections.reverseOrder());
            for(int i:pq){
                for(int j=0; j<col; j++){
                    cur.add(i+row[j]);
                    if(cur.size()>k){
                        cur.poll();
                    }
                }
            }
            pq = cur;
        }
        return pq.poll();
        
    }
}
// @lc code=end

