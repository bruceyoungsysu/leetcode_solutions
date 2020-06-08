/*
 * @lc app=leetcode id=1358 lang=java
 *
 * [1358] Number of Substrings Containing All Three Characters
 */

// @lc code=start
class Solution {
    public int numberOfSubstrings(String s) {
        char[] arr = s.toCharArray();
        int[] seen = new int[3];
        int n = s.length();
        int res = 0;
        int start = 0, end = 0;
        seen[arr[start]-'a']++;
        while(end<n){
            if(seen[0]>0 && seen[1]>0 && seen[2]>0){
                res+= n-end;
                seen[arr[start]-'a']--;
                start++;
            }
            else{
                end++;
                if(end<n){
                seen[arr[end]-'a']++;
                }
            }
            
        }
        return res;
        
    }
}
// @lc code=end

