import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=1410 lang=java
 *
 * [1410] HTML Entity Parser
 */

// @lc code=start
class Solution {
    public String entityParser(String text) {
        Map<String, String> dic = new HashMap<>();
        dic.put("&quot;", "\"");
        dic.put("&apos;", "'");
        dic.put("&amp;", "&");
        dic.put("&gt;", ">");
        dic.put("&lt;", "<");
        dic.put("&frasl;", "/");
        StringBuilder res = new StringBuilder();
        StringBuilder cur = new StringBuilder();
        for(char c:text.toCharArray()){

            if(c=='&'){
                res.append(cur.toString());
                cur.setLength(0); // ! set to length 0
                cur.append('&');
            }
            else if(c==';'){
                cur.append(';');
                
               if(dic.containsKey(cur.toString())){
                res.append(dic.get(cur.toString()));
                cur.setLength(0);}
            }
            else{
            cur.append(c);}
        }
        res.append(cur.toString());
        return res.toString();
    }
}
// @lc code=end

