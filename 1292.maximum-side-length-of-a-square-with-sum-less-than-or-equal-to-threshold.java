/*
 * @lc app=leetcode id=1292 lang=java
 *
 * [1292] Maximum Side Length of a Square with Sum Less than or Equal to Threshold
 */

// @lc code=start
class Solution {
    int m,n;
    public int maxSideLength(int[][] mat, int threshold) {
        m = mat.length;
        n = mat[0].length;
        int[][] sum = new int[m+1][n+1];

        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                sum[i][j] = sum[i-1][j]+sum[i][j-1]-sum[i-1][j-1]+mat[i-1][j-1];
            }
        }

        int lo=0, hi = Math.min(m, n);
        while(lo<=hi){ //?how to avoid infinite loop in binary search???
            int mid = (lo+hi)/2;

            if(isSqure(sum, mid, threshold)){
                lo = mid+1;
            }
            else{
                hi = mid-1;
            }
        }
        return hi;
    }

    private boolean isSqure(int[][] sum, int len, int threshold){
        for(int i=len; i<=m; i++){
            for(int j=len; j<=n; j++){
                // System.out.println(sum[i][j] + sum[i-len][j-len] - sum[i-len][j] - sum[i][j-len]);}
                if((sum[i][j] + sum[i-len][j-len] - sum[i-len][j] - sum[i][j-len])<=threshold) return true;
            }
        }
        return false;
    }
}
// @lc code=end

