import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=1441 lang=java
 *
 * [1441] Build an Array With Stack Operations
 */

// @lc code=start
class Solution {
    public List<String> buildArray(int[] target, int n) {
        int m = target.length;
        int j=0;
        List<String> res = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(j>=m) break;
            res.add("Push");
            if(target[j] != i){
                res.add("Pop");
            }
            else{
                j++;
            }
        }
        return res;
    }
}
// @lc code=end

