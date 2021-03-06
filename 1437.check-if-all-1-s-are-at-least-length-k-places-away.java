import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=1437 lang=java
 *
 * [1437] Check If All 1's Are at Least Length K Places Away
 */

// @lc code=start
class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        List<Integer> dist = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1) dist.add(i);
        }
        for(int j=0; j<dist.size()-1;j++){

            if(dist.get(j+1)-dist.get(j)-1<k) return false;
        }
        return true;
    }
}
// @lc code=end

