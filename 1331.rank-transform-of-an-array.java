import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

/*
 * @lc app=leetcode id=1331 lang=java
 *
 * [1331] Rank Transform of an Array
 */

// @lc code=start
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] order = arr.clone();
        Arrays.sort(order);
        HashMap<Integer, Integer> rank = new HashMap<>();
        int r = 1;
        for(int i=0; i<order.length; i++){
            if(i==0 || order[i]>order[i-1]){
                rank.put(order[i], r);
                r++;
            }
        }
        for(int i=0; i<arr.length; i++){
            // System.out.println(arr[i]);
            arr[i] = rank.get(arr[i]);
        }
        return arr;
    }
}
// @lc code=end

