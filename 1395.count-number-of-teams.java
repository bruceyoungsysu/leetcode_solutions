/*
 * @lc app=leetcode id=1395 lang=java
 *
 * [1395] Count Number of Teams
 */

// @lc code=start
class Solution {
    public int numTeams(int[] rating) {
        int n = rating.length;
        int[] decreasingPair = new int[n];
        int[] increasingPair = new int[n];
        decreasingPair[0] = 0;
        increasingPair[0] = 0;
        for(int i=1; i<n; i++){
            for(int j = 0; j<i; j++){
                if(rating[j]>rating[i]){
                    decreasingPair[i]++;
                }
                else if(rating[j]<rating[i]){
                    increasingPair[i]++;
                }
            }
        }
        int res = 0;
        for(int i=1; i<rating.length; i++){
            for(int j=0; j<i; j++){
                if(rating[i]<rating[j]) res+=decreasingPair[j];
                if(rating[i]>rating[j]) res+=increasingPair[j];
            }
        }
        return res;
    }
}
// @lc code=end

