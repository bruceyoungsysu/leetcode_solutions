import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * @lc app=leetcode id=1415 lang=java
 *
 * [1415] The k-th Lexicographical String of All Happy Strings of Length n
 */

// @lc code=start
class Solution {
    String[] cands = new String[]{"a","b","c"};
    public String getHappyString(int n, int k) {
        List<String> permutions = findPermutions(n);
        if(k>permutions.size()) return "";
        Collections.sort(permutions);
        return permutions.get(k-1);
    }

    private List<String> findPermutions(int n){
        if(n==0) return new ArrayList<>();
        List<String> tmp = new ArrayList<>();
        List<String> next = findPermutions(n-1);
        if(next.size()==0) return Arrays.asList(cands);
        for(String cur:cands){
            for (String string : next) {
                if(string.charAt(0)!=cur.charAt(0)){
                    tmp.add(cur+string);
                }
            }
        }
        return tmp;
    }
}
// @lc code=end

