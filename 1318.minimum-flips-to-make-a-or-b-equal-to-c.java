/*
 * @lc app=leetcode id=1318 lang=java
 *
 * [1318] Minimum Flips to Make a OR b Equal to c
 */

// @lc code=start
class Solution {
    public int minFlips(int a, int b, int c) {
        int res = 0;
        while(a>0 || b>0 || c>0){
            if(a%2!=c%2 && b%2!=c%2){
                if(c%2==0) res+=2;
                else res+=1;
            }
            else if(a%2!=c%2 || b%2!=c%2){
                if(c%2==0) res++;
            }
            a/=2;
            b/=2;
            c/=2;
        }
        return res;
    }
}
// @lc code=end

