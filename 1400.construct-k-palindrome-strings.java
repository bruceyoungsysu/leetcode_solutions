import java.util.Arrays;

/*
 * @lc app=leetcode id=1400 lang=java
 *
 * [1400] Construct K Palindrome Strings
 */

// @lc code=start
class Solution {
    public boolean canConstruct(String s, int k) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        int pair = 0, single = 0;
        int i=0;
        while(i<chars.length-1){
            if(chars[i]==chars[i+1]){
                pair++;
                i+=2;
            }
            else{
                single++;
                i++;
            }
        }
        if(i==chars.length-1) single++;

        while((pair+single<k)){
            pair--;
            single+=2;
        }
        if((pair+single)>=k && single<=k) return true;
        return false;
    }
}
// @lc code=end

