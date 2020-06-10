/*
 * @lc app=leetcode id=1372 lang=java
 *
 * [1372] Longest ZigZag Path in a Binary Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int max = 0;
    public int longestZigZag(TreeNode root){
        if(root == null) return -1;
        max = 0; //! reinit after each call of the solution
        helper(root.left, 1, false);
        helper(root.right,1, true);
        return max;
    }

    public void helper(TreeNode node, int step, boolean fromRight){
        if(node == null) return;
        max = Math.max(max, step);
        if(fromRight){
            helper(node.left, step+1, false);
            helper(node.right, 1, true);
        }
        else{
            helper(node.left, 1, false);
            helper(node.right, step+1, true);
        }
    }

    
}
// @lc code=end

