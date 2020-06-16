import java.util.TreeMap;

/*
 * @lc app=leetcode id=1438 lang=java
 *
 * [1438] Longest Continuous Subarray With Absolute Diff Less Than or Equal to Limit
 */

// @lc code=start
class Solution {
    public int longestSubarray(int[] nums, int limit) {
        TreeMap<Integer, Integer> m = new TreeMap<>();
        int i=0,j;
        for(j=0; j<nums.length;j++){
            m.put(nums[j], m.getOrDefault(nums[j], 0)+1);
            if(m.lastEntry().getKey()-m.firstEntry().getKey()>limit){
                m.put(nums[i], m.get(nums[i])-1);
                if(m.get(nums[i])==0){
                    m.remove(nums[i]);
                }
                i++; //keep the largest window of j-i
            }
        }
        return j-i;
    }
}
// @lc code=end

