/*
 * @lc app=leetcode id=1446 lang=java
 *
 * [1446] Consecutive Characters
 */

// @lc code=start
class Solution {
    public int maxPower(String s) {
        char prev = s.charAt(0);
        int res = 1;
        int cur = 1;
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i)==prev){
                cur++;
                res = Math.max(res, cur);
            }
            else{
                cur = 1;
            }
            prev = s.charAt(i);
        }
        return res;
    }
}
// @lc code=end

