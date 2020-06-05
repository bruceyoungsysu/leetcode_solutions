/*
 * @lc app=leetcode id=1328 lang=java
 *
 * [1328] Break a Palindrome
 */

// @lc code=start
class Solution {
    public String breakPalindrome(String palindrome) {
        char[] arr = palindrome.toCharArray();
        int n = arr.length;
        for(int i=0; i<n/2; i++){
            if(arr[i]!='a'){
                arr[i] = 'a';
                return String.valueOf(arr);
            }
        }
        arr[n-1] = 'b';
        return arr.length<2?"":String.valueOf(arr);

    }
}
// @lc code=end

