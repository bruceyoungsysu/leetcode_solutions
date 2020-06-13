import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=1414 lang=java
 *
 * [1414] Find the Minimum Number of Fibonacci Numbers Whose Sum Is K
 */

// @lc code=start
class Solution {

    public int findMinFibonacciNumbers(int k) {
        List<Integer> fibs = new ArrayList<>();
        int f1=1, f2=1, f3=-1;
        while(f2<=k){
            fibs.add(f2);
            f3 = f1+f2;
            f1 = f2;
            f2 = f3;
        }
        return findF(k, fibs);
    }

    private int findF(int num, List<Integer> fibs){
        if(num==0) return 0;
        for(int i=fibs.size()-1; i>=0;i--){
            if(fibs.get(i)>num) fibs.remove(i);
        }
        return 1+findF(num-fibs.get(fibs.size()-1), fibs);
    }

}
// @lc code=end

