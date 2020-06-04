

/*
 * @lc app=leetcode id=1314 lang=java
 *
 * [1314] Matrix Block Sum
 */

// @lc code=start
class Solution {
    public int[][] matrixBlockSum(int[][] mat, int K) {
        int m = mat.length, n = mat[0].length;
        int[][] sum = new int[m+1][n+1];
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                sum[i][j] = sum[i-1][j]+sum[i][j-1]+mat[i-1][j-1]-sum[i-1][j-1];
            }
        }

        int[][] ans = new int[m][n];
        for(int r=0; r<m; r++){
            for(int c=0; c<n; c++){
                
                int rs = Math.max(r-K,0),re = Math.min(r+K, m-1),cs = Math.max(c-K,0),ce = Math.min(c+K,n-1);
                rs++; re++; cs++; ce++;
                ans[r][c] = sum[re][ce] + sum[rs-1][cs-1] -  sum[rs-1][ce] - sum[re][cs-1];
            }
        }
        return ans;

    }
}
// @lc code=end

