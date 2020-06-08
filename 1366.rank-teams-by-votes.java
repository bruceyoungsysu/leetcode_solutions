import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * @lc app=leetcode id=1366 lang=java
 *
 * [1366] Rank Teams by Votes
 */

// @lc code=start
class Solution {
    public String rankTeams(String[] votes) {
        int l = votes[0].length();
        Map<Character, int[]> map = new HashMap<>();
        for(String vote:votes){
            for(int i=0; i<l;i++){
                char c = vote.charAt(i);
                map.putIfAbsent(c, new int[l]);
                map.get(c)[i]++;
            }
        }
        List<Character> res = new ArrayList<>(map.keySet());
        Collections.sort(res, (a,b)->{
            for(int i=0; i<l; i++){
                if(map.get(a)[i] != map.get(b)[i]){
                    return map.get(b)[i]-map.get(a)[i];
                }
            }
            return a-b;
        });
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<l; i++){
            sb.append(res.get(i));
        }
        return sb.toString();
    }
}
// @lc code=end

