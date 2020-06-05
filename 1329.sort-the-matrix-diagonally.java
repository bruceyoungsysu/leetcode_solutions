import java.util.HashMap;
import java.util.PriorityQueue;

/*
 * @lc app=leetcode id=1329 lang=java
 *
 * [1329] Sort the Matrix Diagonally
 */

// @lc code=start
class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int m=mat.length, n = mat[0].length;
        HashMap<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                map.putIfAbsent(i-j, new PriorityQueue<>());
                map.get(i-j).add(mat[i][j]);
            }
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                mat[i][j] = map.get(i-j).poll();
            }
        }
        return mat;
    }
}
// @lc code=end

