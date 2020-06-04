import java.util.HashMap;

/*
 * @lc app=leetcode id=1287 lang=java
 *
 * [1287] Element Appearing More Than 25% In Sorted Array
 */

// @lc code=start
class Solution {
    public int findSpecialInteger(int[] arr) {
        int C = arr.length/4;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int a:arr){
            if(!map.containsKey(a)){
                map.put(a,0);
            }
            int val = map.get(a)+1;
            if(val>C) return a;
            map.put(a, val);
        }
        return -1;
        
    }
}
// @lc code=end

