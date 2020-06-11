import java.util.Arrays;

/*
 * @lc app=leetcode id=1402 lang=java
 *
 * [1402] Reducing Dishes
 */

// @lc code=start
class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int n = satisfaction.length;
        int[] acc = new int[n+1];
        int res = 0;
        for(int i=n-1; i>=0; i--){
            acc[i] = acc[i+1]+satisfaction[i];
            if(acc[i]>0) res+=acc[i];
        }
        return res;

    }
}
// @lc code=end

