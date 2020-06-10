import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
 * @lc app=leetcode id=1381 lang=java
 *
 * [1381] Design a Stack With Increment Operation
 */

// @lc code=start
class CustomStack {

    private List<Integer> list = new ArrayList<>();
    private int size;

    public CustomStack(int maxSize) {
        size = maxSize;
    }
    
    public void push(int x) {
        if(list.size()<size){
            list.add(x);
        } 
    }
    
    public int pop() {
        if(list.size()>0){
            int last = list.get(list.size()-1);
            list.remove(list.size()-1);
            return last;
        }
        return -1;
    }
    
    public void increment(int k, int val) {
        
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
// @lc code=end

