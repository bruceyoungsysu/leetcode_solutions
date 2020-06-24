import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*
 * @lc app=leetcode id=1451 lang=java
 *
 * [1451] Rearrange Words in a Sentence
 */

// @lc code=start
class Solution {
    public String arrangeWords(String text) {
        String[] arr = text.split(" ");
        int n = arr.length;
        TreeMap<Integer, List<String>> map = new TreeMap<>();
        for(String s:arr){
            int l = s.length();
            map.putIfAbsent(l, new ArrayList<>());
            map.get(l).add(s);
        }
        StringBuilder sb = new StringBuilder();

        for(int k:map.keySet()){
            for(int j=0; j<map.get(k).size(); j++){
                String s = map.get(k).get(j).toLowerCase();
                if(sb.length()<1){
                    s = s.substring(0, 1).toUpperCase() + s.substring(1);
                }
                sb.append(s);
                sb.append(" ");
            }
        }
        sb.delete(sb.length()-1, sb.length());
        return sb.toString();
        
    }
}
// @lc code=end

