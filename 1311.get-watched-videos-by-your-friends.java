import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/*
 * @lc app=leetcode id=1311 lang=java
 *
 * [1311] Get Watched Videos by Your Friends
 */

// @lc code=start
class Solution {
    public List<String> watchedVideosByFriends(List<List<String>> watchedVideos, int[][] friends, int id, int level) {
        Queue<Integer> front = new LinkedList<>();
        Set<Integer> seen = new HashSet<>();
        Map<String, Integer> map = new HashMap<>();
        front.add(id);
        seen.add(id);
        while(level>0 && !front.isEmpty()){
            int size = front.size();
            for(int i=0;i<size;i++){
                int cur = front.poll();
                for(int nei:friends[cur]){
                    if(!seen.contains(nei)){
                    seen.add(nei); // !note where to put the seen.add phrase
                    front.add(nei);}
                }
            }
            level--;
        }
        while(!front.isEmpty()){
            for(String v: watchedVideos.get(front.poll())){
                map.put(v, map.getOrDefault(v, 0)+1);
            }
        }
        List<String> res = new ArrayList<>(map.keySet());
        res.sort((a,b)->{
            int fa = map.get(a);
            int fb = map.get(b);
            if(fa!=fb) return fa-fb;
            else{
                return a.compareTo(b);
            }
        });
        return res;
    }
}
// @lc code=end

