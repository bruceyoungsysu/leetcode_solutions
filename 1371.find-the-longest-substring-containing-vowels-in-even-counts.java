import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=1371 lang=java
 *
 * [1371] Find the Longest Substring Containing Vowels in Even Counts
 */

// @lc code=start
class Solution {
    public int findTheLongestSubstring(String s) {
        int cur =0, res = 0, n = s.length();
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); //! in case substring starts from index 0
        for(int i=0 ;i<s.length(); i++){
            char c = s.charAt(i);
            cur ^= 1<<(("aeiou".indexOf(c))+1)>>1;
            map.putIfAbsent(cur, i);
            res = Math.max(res, i-map.get(cur));
        }
        return res;
    }
}
// @lc code=end

