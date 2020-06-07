import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=1357 lang=java
 *
 * [1357] Apply Discount Every n Orders
 */

// @lc code=start
class Cashier {

    public int count;
    public int n;
    public int discount;
    public Map<Integer, Integer> dic = new HashMap<>();
    public Cashier(int n, int discount, int[] products, int[] prices) {
        this.n = n;
        this.discount = discount;
        for(int i=0; i<products.length; i++){
            dic.put(products[i], prices[i]);
        }
        count = 0;
        
    }
    
    public double getBill(int[] product, int[] amount) {
        count++;
        double sum = 0;
        for(int i=0; i<product.length; i++){
            int p = product[i];
            sum += amount[i]*dic.get(p);
        }
        if(count == this.n){
            sum = sum-(discount/100.0*sum);
            count = 0;
        }
        return sum;
        
    }
}

/**
 * Your Cashier object will be instantiated and called as such:
 * Cashier obj = new Cashier(n, discount, products, prices);
 * double param_1 = obj.getBill(product,amount);
 */
// @lc code=end

