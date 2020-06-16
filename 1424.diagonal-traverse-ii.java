import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/*
 * @lc app=leetcode id=1424 lang=java
 *
 * [1424] Diagonal Traverse II
 */

// @lc code=start
class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        Map<Integer, Stack<Integer>> map = new HashMap<>();
        int maxIdx = 0,size = 0;
        for(int i=0; i<nums.size(); i++){
            for(int j=0; j<nums.get(i).size(); j++){
                map.putIfAbsent(i+j, new Stack<>());
                maxIdx = Math.max(maxIdx, i+j);
                map.get(i+j).add(nums.get(i).get(j));
                size++;
            }
        }
        int[] res = new int[size];
        int resIdx = 0;
        for(int k=0; k<=maxIdx; k++){
            while(map.get(k)!=null && !map.get(k).isEmpty()){
                res[resIdx] = map.get(k).pop();
                resIdx++;
            }
        }
        return res;

    }
}
// @lc code=end

