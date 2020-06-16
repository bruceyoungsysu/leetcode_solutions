import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode id=1436 lang=java
 *
 * [1436] Destination City
 */

// @lc code=start
class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String, Integer> count = new HashMap<>();
        for(int i=0; i<paths.size(); i++){
            String s = paths.get(i).get(0);
            String d = paths.get(i).get(1);
            count.putIfAbsent(s, 0);
            count.putIfAbsent(d, 0);
            count.put(s, count.get(s)-1);
            count.put(d, count.get(d)+1);
        }
        for(String k:count.keySet()){
            if(count.get(k)==1) return k;
        }
        return "";
        
    }
}
// @lc code=end

