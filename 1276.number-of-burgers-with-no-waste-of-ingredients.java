import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=1276 lang=java
 *
 * [1276] Number of Burgers with No Waste of Ingredients
 */

// @lc code=start
class Solution {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        List<Integer> res = new ArrayList<Integer>();
        if(tomatoSlices>cheeseSlices*4 || tomatoSlices<cheeseSlices*2) return res;
        if((tomatoSlices-2*cheeseSlices)%2 !=0 || (4*cheeseSlices-tomatoSlices)%2!=0) return res;
        res.add((tomatoSlices-2*cheeseSlices)/2);
        res.add((4*cheeseSlices-tomatoSlices)/2);
        return res;
    }
}
// @lc code=end

