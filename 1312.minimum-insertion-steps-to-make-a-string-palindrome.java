import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=1312 lang=java
 *
 * [1312] Minimum Insertion Steps to Make a String Palindrome
 */

// @lc code=start
class Solution {
    private Map<String, Integer> seen = new HashMap<>();
    public int minInsertions(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        if(n<=1) return 0;
        if(seen.containsKey(s)) return seen.get(s);
        int prev;
        if(arr[0]==arr[n-1]){
            prev = minInsertions(s.substring(1, n-1));
        }
        else{
        prev = Math.min(minInsertions(s.substring(1, n)), minInsertions(s.substring(0, n-1)))+1;
        }
        seen.put(s, prev);
        return prev;
        
    }
}
// @lc code=end

