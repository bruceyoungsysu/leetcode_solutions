import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=1296 lang=java
 *
 * [1296] Divide Array in Sets of K Consecutive Numbers
 */

// @lc code=start
class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        if(nums.length%k!=-0) return false;
        Map<Integer, Integer> map = new HashMap<>();
        for(int n:nums){
            if(!map.containsKey(n)){
                map.put(n, 0);
            }
            map.put(n, map.get(n)+1);
        }
        Arrays.sort(nums);
        for(int n: nums){
            if(map.containsKey(n)){
            for(int i=n; i<n+k; i++){
                
                if(!map.containsKey(i)) return false;
                int val = map.get(i)-1;
                if(val == 0){
                    map.remove(i);
                }
                else{
                map.put(i, val);}
            }
        }}
        return true;
    }
}
// @lc code=end

