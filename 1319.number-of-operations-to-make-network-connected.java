
/*
 * @lc app=leetcode id=1319 lang=java
 *
 * [1319] Number of Operations to Make Network Connected
 */

// @lc code=start
class Solution {
    public int makeConnected(int n, int[][] connections) {
       if(connections.length<n-1) return -1;
       int[] parents = new int[n];
       for(int i=0; i<n; i++) parents[i] = i;
       int components = n;
       for(int[] c: connections){
           int p1 = findParent(parents, c[0]);
           int p2 = findParent(parents, c[1]);
           if(p1!=p2){
               parents[p1] = p2;
               components--; // union the connections
           }
       }
       return components-1;
    }
    private int findParent(int[] parents, int c){
        while(c!=parents[c]){
            c = parents[c];
        }
        return c;
    }
}
// @lc code=end

