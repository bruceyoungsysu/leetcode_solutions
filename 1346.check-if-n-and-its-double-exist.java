import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode id=1346 lang=java
 *
 * [1346] Check If N and Its Double Exist
 */

// @lc code=start
class Solution {
    public boolean checkIfExist(int[] arr) {
        int count0 = 0;
        Set<Integer> seen = new HashSet<>();
        for(int a:arr){
            seen.add(a);
        }
        for(int a:arr){
            if(a==0) count0++;
            if(a!=0 && seen.contains(a*2)) return true;
        }
        if(count0>=2) return true;
        return false;
    }
}
// @lc code=end

