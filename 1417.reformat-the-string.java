/*
 * @lc app=leetcode id=1417 lang=java
 *
 * [1417] Reformat The String
 */

// @lc code=start
class Solution {
    public String reformat(String s) {
        StringBuilder chars = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c>='a' && c<='z') chars.append(c);
            else digits.append(c);
        }
        if(Math.abs(chars.length()-digits.length())>=2) return "";
        String first, second;
        if(chars.length()>digits.length()){
            first = chars.toString(); second = digits.toString();
        }
        else{
            second = chars.toString(); first = digits.toString();
        }
        StringBuilder res = new StringBuilder();
        int i=0,j=0;
        while(i<first.length() && j<second.length()){
            res.append(first.charAt(i++));
            res.append(second.charAt(j++));
        }
        if(i<first.length()) res.append(first.charAt(i));
        return res.toString();

    }
}
// @lc code=end

