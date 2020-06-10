import java.util.ArrayList;

/*
 * @lc app=leetcode id=1380 lang=java
 *
 * [1380] Lucky Numbers in a Matrix
 */

// @lc code=start
class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[] rowMin = new int[n];
        int[] colMax = new int[n];
        for(int i=0; i<m; i++){
            int min = Integer.MAX_VALUE;
            int cor = -1;
            for(int j=0; j<n; j++){
                if(matrix[i][j]<min){
                    min = matrix[i][j];
                    cor = j;
                }
                colMax[j] = Math.max(colMax[j], matrix[i][j]);
            }
            rowMin[cor] = Math.max(min, rowMin[cor]);
        }
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<n; i++){
            // System.out.println(rowMin[i]);
            // System.out.println(colMax[i]);
            if(rowMin[i] == colMax[i]) res.add(rowMin[i]);
        }
        return res;
    }
}
// @lc code=end

