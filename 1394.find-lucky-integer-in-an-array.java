import java.util.HashMap;

/*
 * @lc app=leetcode id=1394 lang=java
 *
 * [1394] Find Lucky Integer in an Array
 */

// @lc code=start
class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for(int a:arr){
            count.put(a, count.getOrDefault(a, 0)+1);
        }
        int res = -1;
        for(int k:count.keySet()){
            if(k==count.get(k)){
                res = Math.max(count.get(k),res);
            }
        }
        return res;
    }
}
// @lc code=end

