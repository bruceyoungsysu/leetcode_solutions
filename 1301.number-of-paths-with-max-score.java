import java.util.List;

/*
 * @lc app=leetcode id=1301 lang=java
 *
 * [1301] Number of Paths with Max Score
 */

// @lc code=start
class Solution {
    private static final int[][] dirs = new int[][]{{0,-1},{-1,0},{-1,-1}};
    public int[] pathsWithMaxScore(List<String> board) {
        int m = board.size(), n = board.get(0).length();
        int[][] dpCnt = new int[m][n];
        int[][] dpSum = new int[m][n];
        dpCnt[m-1][n-1] = 1;
        for(int r=m-1; r>=0; r--){
            for(int c =n-1; c>=0; c--){
                if(dpCnt[r][c]==0) continue;
                for(int[] dir:dirs){
                    int nr = r+dir[0], nc = c+dir[1];
                    if(nr>=0 &&  nc>=0 && board.get(nr).charAt(nc)!='X'){
                        int curSum = dpSum[r][c];
                        if(board.get(nr).charAt(nc)!='E'){
                            curSum += board.get(nr).charAt(nc)-'0';
                        }
                        if(curSum>dpSum[nr][nc]){
                            dpSum[nr][nc] = curSum;
                            dpCnt[nr][nc] = dpCnt[r][c];
                        }
                        else if(curSum == dpSum[nr][nc]){
                            dpCnt[nr][nc] = (dpCnt[r][c]+dpCnt[nr][nc])%1000000007;
                        }
                        
                    }
                }

            }
        }
        return new int[]{dpSum[0][0], dpCnt[0][0]};
        
    }
}
// @lc code=end

