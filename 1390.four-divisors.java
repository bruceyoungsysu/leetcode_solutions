/*
 * @lc app=leetcode id=1390 lang=java
 *
 * [1390] Four Divisors
 */

// @lc code=start
class Solution {
    public int sumFourDivisors(int[] nums) {
        int res = 0;
        for(int n:nums){
            int last_d = 0;
            for(int i=2;i*i<=n;i++){
                if(n%i==0){
                    if(last_d==0) last_d = i;
                    else{
                        last_d = 0;
                        break;
                    }
                }
            }
            if(last_d!=0 && n/last_d!=last_d){
                res+=1+n+last_d+n/last_d;
            }
        }
        return res;
    }
}
// @lc code=end

