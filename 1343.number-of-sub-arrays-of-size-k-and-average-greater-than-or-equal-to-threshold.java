/*
 * @lc app=leetcode id=1343 lang=java
 *
 * [1343] Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold
 */

// @lc code=start
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int sum = 0;
        int ans = 0;
        for(int i=0; i<k; i++){
            sum += arr[i];
        }
        if(sum/k>=threshold) ans++;
        for(int j=1; j<n-k+1; j++){
            sum -= arr[j-1];
            sum += arr[j+k-1];
            if(sum/k>=threshold) ans++;
        }
        return ans;
        
    }
}
// @lc code=end

