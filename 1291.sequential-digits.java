import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=1291 lang=java
 *
 * [1291] Sequential Digits
 */

// @lc code=start
class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        int l = low;
        int digit = 0, first = 0;
        while(l>=10){
            l /= 10;
            digit += 1;
        }
        digit += 1;
        first = l;
        List<Integer> res = new ArrayList<>();
        int nextUp = low;

        while(nextUp < high){
            if(first+digit > 10){
                first = 1;
                digit++;
            }
            // System.out.println(first);
            // System.out.println(digit);
            nextUp = generateNum(first, digit);
            if(nextUp>=low && nextUp < high){
                res.add(nextUp);}
            first++;
        }
        return res;
    }

    private int generateNum(int first, int digit){
        int temp = 0;
        while(digit>0){
            temp *= 10;
            temp += first;
            first++;
            digit--;
        }
        return temp;
    }
}
// @lc code=end

