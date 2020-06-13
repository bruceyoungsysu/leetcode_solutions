import java.util.List;

/*
 * @lc app=leetcode id=1408 lang=java
 *
 * [1408] String Matching in an Array
 */

// @lc code=start
class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> res = new ArrayList<>();
        for(int i=0; i<words.length-1; i++){
            for(int j=i+1; j<words.length; j++){
                    // System.out.println(words[i]);
                    // System.out.println(words[j]);
                    // System.out.println(isSubstring(words[i], words[j]));
                    if(words[i].contains(words[j]) && !res.contains(words[j]))
                        res.add(words[j]);
                    if(words[j].contains(words[i]) && !res.contains(words[i]))
                        res.add(words[i]);     
            }
            
        }
        return res;
    }
}
// @lc code=end

