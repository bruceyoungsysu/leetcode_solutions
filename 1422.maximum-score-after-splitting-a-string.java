/*
 * @lc app=leetcode id=1422 lang=java
 *
 * [1422] Maximum Score After Splitting a String
 */

// @lc code=start
class Solution {
    public int maxScore(String s) {
        int right = 0;
        int n = s.length();
        int max = 0;
        for(int i=0; i<n; i++){
            if(s.charAt(i)=='1') right++;
        }
        int left = 0;
        for(int j=0; j<n-1;j++){
            if(s.charAt(j)=='1' && right>0) right--;
            else left++;
            if((left+right)>max){
                max = left+right;
            }
        }
        return max;
    }
}
// @lc code=end

