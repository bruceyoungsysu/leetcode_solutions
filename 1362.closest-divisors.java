/*
 * @lc app=leetcode id=1362 lang=java
 *
 * [1362] Closest Divisors
 */

// @lc code=start
class Solution {
    public int[] closestDivisors(int num) {
        int[] res1 = findClosest(num+1);
        int[] res2 = findClosest(num+2);
        return res1[1]-res1[0]>res2[1]-res2[0]? res2:res1;
    }
    private int[] findClosest(int num){
        int i = (int)Math.sqrt(num);
        while(num%i!=0) i--;
        return new int[]{i, num/i};
    }
}
// @lc code=end

