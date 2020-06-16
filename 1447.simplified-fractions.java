import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=1447 lang=java
 *
 * [1447] Simplified Fractions
 */

// @lc code=start
class Solution {
    public List<String> simplifiedFractions(int n) {
        List<String> res = new ArrayList<>();
        for(int no=1; no<n;no++){
            for(int de=no+1; de<=n; de++){
                if(no==1 || maxCommonDivisor(de, no)==1){
                    res.add(no+"/"+de);
                }
            }
        }
        return res;
    }

    public static int maxCommonDivisor(int m, int n) {
		if (m < n) {
			int temp = m;
			m = n;
			n = temp;
		}
		if (m % n == 0) {
			return n;
		} else { 
			return maxCommonDivisor(n, m % n);
		}
	}
}
// @lc code=end

