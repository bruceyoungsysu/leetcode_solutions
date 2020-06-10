/*
 * @lc app=leetcode id=1374 lang=java
 *
 * [1374] Generate a String With Characters That Have Odd Counts
 */

// @lc code=start
class Solution {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        int m = n;
        if(m%2==0){
            m--;
        }
        while(m>0){
            sb.append('a');
            m--;
        }
        if(n-sb.length()==1){
            sb.append('b');
        }
        return sb.toString();

    }
}
// @lc code=end

