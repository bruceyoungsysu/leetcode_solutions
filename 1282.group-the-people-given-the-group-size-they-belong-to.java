import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode id=1282 lang=java
 *
 * [1282] Group the People Given the Group Size They Belong To
 */

// @lc code=start
class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> res = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        List<Integer> cur;
        for(int i=0; i<groupSizes.length; i++){
            int size = groupSizes[i];
            if(!map.containsKey(size)){
                cur = new ArrayList<>();
            }
            else{
                cur = map.get(size);
            }
            cur.add(i);
            if(cur.size()== size){
                res.add(cur);
                cur = new ArrayList<>();
            }
            map.put(size, cur);
        }
        return res;
    }
}
// @lc code=end

