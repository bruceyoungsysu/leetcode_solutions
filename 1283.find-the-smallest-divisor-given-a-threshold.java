import java.util.Arrays;

/*
 * @lc app=leetcode id=1283 lang=java
 *
 * [1283] Find the Smallest Divisor Given a Threshold
 */

// @lc code=start
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        Arrays.sort(nums);
        int N = nums.length;
        int left = 1, right = nums[N-1];
        while(left<right){
            int mid = (left+right)/2;
            if(divSum(nums, mid)<=threshold) right = mid;
            else left = mid+1;
        }
        return left;
    }

    private int divSum(int[] nums, int mid){
        int res = 0;
        int N = nums.length;
        for(int i=0;i<N;i++){
            res += nums[i]/mid;
            if(nums[i]%mid>0){
                res++;
            }
        }
        return res;
    }
}
// @lc code=end

