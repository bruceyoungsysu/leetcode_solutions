import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=1324 lang=java
 *
 * [1324] Print Words Vertically
 */

// @lc code=start
class Solution {
    public List<String> printVertically(String s) {
        String[] strs = s.split("\\s+");
        int max = 0;
        for(String str: strs){
            max = Math.max(max, str.length());
        }
        StringBuilder[] ans = new StringBuilder[max];
        for(int i = 0; i<max; i++){
            ans[i] = new StringBuilder();
        }
        for(String str:strs){
            char[] charArr = str.toCharArray();
            int m = charArr.length;
            for(int j=0;j<max; j++){
                if(j>=m){
                    {ans[j].append(' ');}
                }
                else ans[j].append(charArr[j]);
            }
        }
        List<String> res = new ArrayList<>();
        for(int k=0; k<max;k++){
            while(ans[k].charAt(ans[k].length()-1)==' ')
            {ans[k].deleteCharAt(ans[k].length()-1);}
            res.add(ans[k].toString());
        }
        return res;
    }
}
// @lc code=end

