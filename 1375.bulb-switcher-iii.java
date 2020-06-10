import java.util.HashSet;

/*
 * @lc app=leetcode id=1375 lang=java
 *
 * [1375] Bulb Switcher III
 */

// @lc code=start
class Solution {
    public int numTimesAllBlue(int[] light) {
        HashSet<Integer> seen = new HashSet<>();
        int count = 0;
        int leftMost = 1;
        int maxLighted = 0;
        for(int l:light){
            seen.add(l);
            maxLighted = Math.max(maxLighted, l);
            if(l==leftMost){
                while(seen.contains(leftMost)){
                    leftMost++;
                }
                if(leftMost>maxLighted) count++;
            }
        }
        return count;
    }
}
// @lc code=end

