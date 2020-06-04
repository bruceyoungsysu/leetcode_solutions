import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=1238 lang=java
 *
 * [1238] Circular Permutation in Binary Representation
 */

// @lc code=start
class Solution {
    public List<Integer> circularPermutation(int n, int start) {
        List<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < 1 << n; i++) {
            res.add(start ^ i ^ i >> 1);
        }
        return res;
    }
}
// @lc code=end
