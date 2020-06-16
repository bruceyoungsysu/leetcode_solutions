import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/*
 * @lc app=leetcode id=1443 lang=java
 *
 * [1443] Minimum Time to Collect All Apples in a Tree
 */

// @lc code=start
class Solution {
    public HashMap<Integer, List<Integer>> map;
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        map = new HashMap<>();
        for(int[] edge:edges){
            int from = edge[0], end = edge[1];
            map.putIfAbsent(from, new ArrayList<>());
            map.putIfAbsent(end, new ArrayList<>());
            map.get(from).add(end);
            map.get(end).add(from);
        }
        HashSet<Integer> visited = new HashSet<>();
        int r = dfs(0, hasApple, visited);
        return r;
    }

    private int dfs(int node, List<Boolean> hasApple, HashSet<Integer> visited){
        
        visited.add(node);
        int res = 0;
        for(int child:map.getOrDefault(node, new ArrayList<>()))
       {
           if(visited.contains(child)) continue;
           res += dfs(child, hasApple,visited);
        }
        System.out.println(res);
        if((res!=0 || hasApple.get(node))&&node!=0) res+=2;
        return res;
    }
}
// @lc code=end

