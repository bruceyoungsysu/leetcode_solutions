import java.awt.List;
import java.util.ArrayList;

/*
 * @lc app=leetcode id=1389 lang=java
 *
 * [1389] Create Target Array in the Given Order
 */

// @lc code=start
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            res.add(index[i], nums[i]);
        }
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i] = res.get(i);
        }
        return ans;
    }
}
// @lc code=end

