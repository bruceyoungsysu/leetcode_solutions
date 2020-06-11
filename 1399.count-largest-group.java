/*
 * @lc app=leetcode id=1399 lang=java
 *
 * [1399] Count Largest Group
 */

// @lc code=start
class Solution {

    public int countLargestGroup(int n) {
        int[] count = new int[37];
        int max = 0;
        for(int i=1; i<=n; i++){
           int key = dSum(i);
           count[key]++;
           max = Math.max(max, count[key]);
        }
        int res = 0;
        for(int i=1; i<37; i++){
            if(count[i]==max) res++;
        }
        return res;
    }
    private int dSum(int n){
        if(n<10) return n;
        return n%10+dSum(n/10);
    }

}
// @lc code=end

