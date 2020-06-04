import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode id=1284 lang=java
 *
 * [1284] Minimum Number of Flips to Convert Binary Matrix to Zero Matrix
 */

// @lc code=start
class Solution {
    private final int[] d = {0,0,1,0,-1,0}; // moving dimensions
    public int minFlips(int[][] mat) {
        int start = 0, m = mat.length, n = mat[0].length;
        for(int i=0;i<m;i++){
            for(int j=0; j<n; j++){
                start |= mat[i][j]<<(i*n+j);
            }
        }
       Queue<Integer> q = new LinkedList<>(Arrays.asList(start)); // asList is to construct linkedlist on a list
       HashSet<Integer> seen = new HashSet<>();
       for(int step=0; !q.isEmpty(); ++step){
           for(int size = q.size(); size>0; --size){
               int cur = q.poll();
               if(cur==0) return step;
               // begin flipping every digit and its neighbor
               for(int i=0; i<m; i++){
                   for(int j=0;j<n;j++){
                       int next = cur;
                       for(int k=0; k<5; k++){
                           int r = i+d[k], c = j+d[k+1];
                           if(r>=0 && r<m && c>=0 && c<n){
                               next ^= 1<<(r*n+c);
                           }
                       }
                       if(seen.add(next)){ // assert whether next is added to seen already
                           q.offer(next);
                       }
                   }
               }
           }
       }
       return -1;
        
    }
}
// @lc code=end

