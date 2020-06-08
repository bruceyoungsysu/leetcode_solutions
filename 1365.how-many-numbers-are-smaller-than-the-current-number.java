import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=1365 lang=java
 *
 * [1365] How Many Numbers Are Smaller Than the Current Number
 */

// @lc code=start
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] copy = nums.clone();
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(copy);
        for(int i=0; i<copy.length; i++){
            if(!map.containsKey(copy[i])){
            map.put(copy[i], i);}
        }
        for(int i=0; i<nums.length; i++){
            nums[i] = map.get(nums[i]);
        }
        return nums;
    }
}
// @lc code=end

