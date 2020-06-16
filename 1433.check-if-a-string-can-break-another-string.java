import java.util.Arrays;

/*
 * @lc app=leetcode id=1433 lang=java
 *
 * [1433] Check If a String Can Break Another String
 */

// @lc code=start
class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        Arrays.sort(arr1);
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr2);
        int maxDiff = 0;
        for(int i=0; i<s1.length(); i++){
            int curDiff = arr1[i]-arr2[i];
            if(maxDiff*curDiff<0) return false;
            if(curDiff<0) maxDiff = Math.min(curDiff, maxDiff);
            else if(curDiff>0) maxDiff = Math.max(curDiff, maxDiff);
            // System.out.println(maxDiff);
        }
        return true;
    }
}
// @lc code=end

