/*
 * @lc app=leetcode id=1442 lang=java
 *
 * [1442] Count Triplets That Can Form Two Arrays of Equal XOR
 */

// @lc code=start
class Solution {
    public int countTriplets(int[] arr) {
        int n = arr.length;
        int[] xor = new int[n+1];
        for(int i=1; i<=n; i++){
            xor[i] = xor[i-1]^arr[i-1];
        }
        int res = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j;k<n;k++){
                    if((xor[k+1]^xor[j])== (xor[j]^xor[i])) 
                    {   res++;
                        // System.out.println(i);
                        // System.out.println(j);
                        // System.out.println(k);
                    }
                }
            }
        }
        return res;
    }
}
// @lc code=end

