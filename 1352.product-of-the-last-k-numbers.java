import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import apple.laf.JRSUIConstants.Size;

/*
 * @lc app=leetcode id=1352 lang=java
 *
 * [1352] Product of the Last K Numbers
 */

// @lc code=start
class ProductOfNumbers {
    public List<Integer> acc;

    public ProductOfNumbers() {
        acc = new ArrayList<>();
        acc.add(1);
    }
    
    public void add(int num) {
        if(num>0) acc.add(acc.get(acc.size()-1)*num);
        else{acc = new ArrayList<>();acc.add(1);}
    }
    
    public int getProduct(int k) {
       int n = acc.size();
       if(k>=n) return 0;
       else return acc.get(n-1)/acc.get(n-k-1);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
// @lc code=end

