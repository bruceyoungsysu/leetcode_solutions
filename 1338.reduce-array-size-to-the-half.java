import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode id=1338 lang=java
 *
 * [1338] Reduce Array Size to The Half
 */

// @lc code=start
class Solution {
    public int minSetSize(int[] arr) {
        Map<Integer, Integer> count = new HashMap<>();
        for(int a:arr){
            count.put(a, count.getOrDefault(a, 0)+1);
        }
        List<Integer> vals = new ArrayList<>(count.values());
        vals.sort((a,b)->{return b-a;});
        int n = arr.length;
        int cur = 0;
        int idx = 0;
        for(int v : vals) {
            cur+=v;
            idx++;
            // System.out.println(cur);
            if(cur*2>=n) return idx;
        }
        return -1;

    }
}
// @lc code=end

