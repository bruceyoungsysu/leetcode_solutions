/*
 * @lc app=leetcode id=1419 lang=java
 *
 * [1419] Minimum Number of Frogs Croaking
 */

// @lc code=start
class Solution {
    public int minNumberOfFrogs(String croakOfFrogs) {
        int[] count = new int[5];
        int curFrogs = 0, maxFrogs = 0;
        for(int i=0; i<croakOfFrogs.length(); i++){
            int c ="croak".indexOf(croakOfFrogs.charAt(i));
            count[c]++;
            if(c==0) {curFrogs++;maxFrogs = Math.max(maxFrogs, curFrogs);}
            else if(count[c-1]-count[c]<0) return -1;
            if(c==4){
                curFrogs--;
            }
            
        }
        return count[4]==count[0]?maxFrogs:-1;
    }
}
// @lc code=end

