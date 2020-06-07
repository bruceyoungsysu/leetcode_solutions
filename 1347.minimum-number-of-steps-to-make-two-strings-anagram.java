import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * @lc app=leetcode id=1347 lang=java
 *
 * [1347] Minimum Number of Steps to Make Two Strings Anagram
 */

// @lc code=start
class Solution {
    public int minSteps(String s, String t) {
        char[] sa = s.toCharArray();
        char[] st = t.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        for(char a:sa){
            map.put(a, map.getOrDefault(a, 0)+1);
        }
        for(char ct:st){
             if(!map.containsKey(ct)) count++;
             else{
                 map.put(ct, map.get(ct)-1);
                 if(map.get(ct)==0){
                     map.remove(ct);
                 }
             }
        }
        return count;
    }
}
// @lc code=end

