/*
 * @lc app=leetcode id=1315 lang=java
 *
 * [1315] Sum of Nodes with Even-Valued Grandparent
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
    private int res=0;
    public int sumEvenGrandparent(TreeNode root) {
        helper(root, -1);
        return res;
        
    }

    private void helper(TreeNode node, int parent){
        if(node.left != null){
            if(parent%2==0) res+=node.left.val;
            helper(node.left, node.val);
        }
        if(node.right!=null){
            if(parent%2==0) res+=node.right.val;
            helper(node.right, node.val);
        }
        
    }
}
// @lc code=end

