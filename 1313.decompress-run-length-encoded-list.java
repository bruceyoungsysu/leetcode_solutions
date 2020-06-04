import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=1313 lang=java
 *
 * [1313] Decompress Run-Length Encoded List
 */

// @lc code=start
class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        for(int i=0; i+1<nums.length; i+=2){
            int freq = nums[i];
            int n = nums[i+1];
            while(freq>0){
                res.add(n);
                freq--;
            }
        }
        int[] r = new int[res.size()];
        for(int j=0; j<res.size(); j++){
            r[j] = res.get(j);
        }
        return r;
    }
}
// @lc code=end

