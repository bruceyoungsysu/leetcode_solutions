import java.util.LinkedList;
import java.util.Stack;

/*
 * @lc app=leetcode id=1309 lang=java
 *
 * [1309] Decrypt String from Alphabet to Integer Mapping
 */

// @lc code=start
class Solution {
    public String freqAlphabets(String s) {
        Stack<Integer> res = new Stack<>();
        for(char c:s.toCharArray()){
            if(c!='#'){
                res.push(c-'0');
            }
            else{
                res.push(res.pop()+res.pop()*10);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!res.isEmpty()){
            sb.append((char)(res.pop()+'a'-1));
        }
        return sb.reverse().toString();
        
    }
}
// @lc code=end

