import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode id=1333 lang=java
 *
 * [1333] Filter Restaurants by Vegan-Friendly, Price and Distance
 */

// @lc code=start
class Solution {
    public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
        List<int[]> res = new ArrayList<>();
        for(int[] r: restaurants){
            if(r[2] >= veganFriendly && r[3]<=maxPrice && r[4]<=maxDistance){
                res.add(new int[] {r[0], r[1]});
            }
        }
        res.sort((a,b)->{
            if(a[1]!=b[1]) return b[1]-a[1];
            else return b[0]-a[0];
        });
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<res.size(); i++){
            ans.add(res.get(i)[0]);
        }
        return ans;
        
    }
}
// @lc code=end

