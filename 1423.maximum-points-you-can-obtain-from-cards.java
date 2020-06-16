/*
 * @lc app=leetcode id=1423 lang=java
 *
 * [1423] Maximum Points You Can Obtain from Cards
 */

// @lc code=start
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        // sliding window
        int n = cardPoints.length;
        int sum = 0, windowSum = 0;
        int window = n-k;
        for(int i=0; i<n; i++){
            sum += cardPoints[i];
            if(i<n-k-1) windowSum+=cardPoints[i];
        }
        int start = 0, min = Integer.MAX_VALUE;
        if(start+window==0) return sum;
        while(start+window<=n){
            windowSum += cardPoints[start+window-1];
            // System.out.println(windowSum);
            min = Math.min(min, windowSum);
            windowSum -= cardPoints[start];
            start++;
        }
        return sum-min;
    }
}
// @lc code=end

