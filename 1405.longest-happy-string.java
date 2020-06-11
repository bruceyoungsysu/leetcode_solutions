import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

/*
 * @lc app=leetcode id=1405 lang=java
 *
 * [1405] Longest Happy String
 */

// @lc code=start
class Solution {
    private String generate(int a, int b, int c, String aa, String bb, String cc){
        if(a<b) return generate(b,a,c,bb,aa,cc);
        if(b<c) return generate(a,c,b,aa,cc,bb);
        if(b==0) return aa.repeat(Math.min(a, 2));
        int useA = Math.min(a, 2), useB = a-2>=b? 1:0;
        return aa.repeat(useA)+bb.repeat(useB)+generate(a-useA, b-useB, c, aa, bb, cc);
    }
    public String longestDiverseString(int a, int b, int c) {
        return generate(a,b,c,"a","b","c");
    }

    
}

// @lc code=end

