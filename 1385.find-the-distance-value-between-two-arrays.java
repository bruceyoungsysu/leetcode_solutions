/*
 * @lc app=leetcode id=1385 lang=java
 *
 * [1385] Find the Distance Value Between Two Arrays
 */

// @lc code=start
class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0, j=0;
        int inD = 0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]-arr2[j]>d) j++;
            else if(arr2[j]-arr1[i]>d) i++;
            else{
                inD++;
                i++;
            }
        }
        return arr1.length-inD;
    }
}
// @lc code=end

