import java.util.Arrays;

/*
 * @lc app=leetcode id=1300 lang=java
 *
 * [1300] Sum of Mutated Array Closest to Target
 */

// @lc code=start
class Solution {
    public int findBestValue(int[] arr, int target) {
        Arrays.sort(arr);
        int n = arr.length;
        int i =0;
        while(target>arr[i]*(n-i)){
            target -= arr[i];
            i++;
        }
        if(i==n) return arr[n-1];
        int res = target/(n-i);
        if(target-(res*(n-i))>(res+1)*(n-i)-target){
            res++;
        }
        return res;
    }
}
// @lc code=end

