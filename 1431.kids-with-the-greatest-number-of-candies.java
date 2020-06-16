import java.util.ArrayList;
import java.util.Arrays;

/*
 * @lc app=leetcode id=1431 lang=java
 *
 * [1431] Kids With the Greatest Number of Candies
 */

// @lc code=start
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        int n = candies.length;
        for(int i=0; i<n; i++){
            max = Math.max(max, candies[i]);
        }
        List<Boolean> res= new ArrayList<>();
        for(int j=0; j<n; j++){
            if(candies[j]+extraCandies>=max) res.add(true);
            else res.add(false);
        }
        return res;
        
    }
}
// @lc code=end

