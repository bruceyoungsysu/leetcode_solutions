import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=1403 lang=java
 *
 * [1403] Minimum Subsequence in Non-Increasing Order
 */

// @lc code=start
class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += nums[i];
        }
        List<Integer> res = new ArrayList<>();
        Arrays.sort(nums);
        int cur = 0;
        for(int i=n-1; i>=0; i--){
            res.add(nums[i]);
            cur+=nums[i];
            if(cur>sum-cur) break;
        }
        return res;
    }
}
// @lc code=end

