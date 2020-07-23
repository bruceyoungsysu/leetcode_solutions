/*
 * @lc app=leetcode id=743 lang=java
 *
 * [743] Network Delay Time
 */

// @lc code=start
class Solution {
    public int networkDelayTime(int[][] times, int N, int K) {
        // bellman-ford
        int[] dist = new int[N+1];
        for(int i=1; i<=N; i++){
            dist[i] = 600000;
        }
        dist[K] = 0;
        
        for(int j=0; j<N-1; j++){
            for(int[] edge:times){
                int u = edge[0], v = edge[1], w = edge[2];
                if(dist[v]>dist[u]+w) dist[v] = dist[u]+w;
            }
        }
        int res = 0;
        for(int i=1; i<=N; i++){
            if(dist[i] == 600000) return -1;
            res = Math.max(res, dist[i]);
        }
        return res;
    }
}
// @lc code=end

