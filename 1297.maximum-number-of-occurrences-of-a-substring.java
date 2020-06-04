import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=1297 lang=java
 *
 * [1297] Maximum Number of Occurrences of a Substring
 */

// @lc code=start
class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        int start=0, res=0;
        Map<Character, Integer> m = new HashMap<>();
        Map<String, Integer> m2 = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            m.put(c, m.getOrDefault(c, 0)+1);
            if(i-start+1>minSize){
                char c2 = s.charAt(start);
                m.put(c2, m.get(c2)-1);
                if(m.get(c2)==0){
                    m.remove(c2);
                }
                start++;
            }
            if(i-start+1 == minSize && m.size()<=maxLetters){
                String str = s.substring(start, i+1);
                m2.put(str, m2.getOrDefault(str, 0)+1);
                res = Math.max(res, m2.get(str));
            }
        }
        return res;
    }
}
// @lc code=end

