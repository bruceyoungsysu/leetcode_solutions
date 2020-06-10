import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/*
 * @lc app=leetcode id=1387 lang=java
 *
 * [1387] Sort Integers by The Power Value
 */

// @lc code=start
class Solution {
    Map<Integer, Integer> seen = new HashMap<>();
    public int getKth(int lo, int hi, int k) {
        seen = new HashMap<>();
        seen.put(1, 0);
        for(int i=lo; i<=hi; i++){
            findpower(i);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1,o2)->{
            if(seen.get(o1)!=seen.get(o2)) return seen.get(o1)-seen.get(o2);
            return o1-o2;
        });
        
        for(int i=lo; i<=hi; i++){
            pq.add(i);
        }
        while(!pq.isEmpty() && k>1){
            pq.poll();
            k--;
        }
        return pq.poll();

    }

    private void findpower(int num){
        if(seen.containsKey(num)) return;
        int res = 0,next=0;
        if(num%2==0){
            next = num/2;
        }
        else{
            next = 3*num+1;
        }
        findpower(next);
        res = 1+seen.get(next);
        seen.put(num, res);
        return;
    }
}
// @lc code=end

