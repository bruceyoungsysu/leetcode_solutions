import java.util.HashMap;
import java.util.TreeMap;

/*
 * @lc app=leetcode id=1370 lang=java
 *
 * [1370] Increasing Decreasing String
 */

// @lc code=start
class Solution {
    public String sortString(String s) {
        TreeMap<Character, Integer> map = new TreeMap<>();
        for(int i=0;i<s.length(); i++){
            map.putIfAbsent(s.charAt(i), 0);
            map.put(s.charAt(i), map.get(s.charAt(i))+1);
        }
        StringBuilder res = new StringBuilder();
        boolean reverse = false;
        while(res.length()<s.length()){
            StringBuilder temp = new StringBuilder();
            for(char k:map.keySet() ){
                if(map.get(k)!=0){
                    temp.append(k);
                map.put(k, map.get(k)-1);
                }
            }
            if(reverse) temp = temp.reverse();
            res.append(temp);
            reverse = !reverse;
        }
        return res.toString();

    }
}
// @lc code=end

