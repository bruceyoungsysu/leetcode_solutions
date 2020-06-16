import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/*
 * @lc app=leetcode id=1432 lang=java
 *
 * [1432] Max Difference You Can Get From Changing an Integer
 */

// @lc code=start
class Solution {
    public int maxDiff(int num) {
        List<Integer> digits = new ArrayList<>();
        int backup = num;
        int small=num, large=num;
        while(num>0){
            digits.add(num%10);
            num/=10;
        }
        Collections.reverse(digits);
        if(digits.size()==1) return 8;
        
        if(digits.get(0)!=1) small = replace(digits, digits.get(0), 1);
        else{
            for(int i=1; i<digits.size(); i++){
                if(digits.get(i)!=0 && digits.get(i)!=1){
                    small = replace(digits, digits.get(i), 0);
                    break;
                }
            }
        }
        for(int i=0; i<digits.size(); i++){
            if(digits.get(i)!=9){
                large = replace(digits, digits.get(i), 9);
                break;
            }
        }
        // System.out.println(small);
        // System.out.println(large);
        return large-small;


    }

    private int replace(List<Integer> digits, int source, int dest){
        int res = 0;
        for(int i=0; i<digits.size(); i++){
            int next = digits.get(i);
            if(next==source){
                next = dest;
            }
            res = res*10 + next;
        }
        return res;
    }
}
// @lc code=end

