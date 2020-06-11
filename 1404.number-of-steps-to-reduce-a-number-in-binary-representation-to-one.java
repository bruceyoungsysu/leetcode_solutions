/*
 * @lc app=leetcode id=1404 lang=java
 *
 * [1404] Number of Steps to Reduce a Number in Binary Representation to One
 */

// @lc code=start
class Solution {
    public int numSteps(String s) {
        int res = 0;
        char up = '0';
        int n = s.length();
        for(int i=n-1; i>=1; i--){
            if((s.charAt(i)=='0' && up=='0')||(s.charAt(i)=='1' && up=='1')) res++;
            else{
                up = '1';
                res+=2;
            }
        }
        if(up=='1') res++;
        return res;
    }
}
// @lc code=end

