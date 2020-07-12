import java.util.ArrayList;

/*
 * @lc app=leetcode id=95 lang=java
 *
 * [95] Unique Binary Search Trees II
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
    public List<TreeNode> generateTrees(int n) {
        List<TreeNode>[] dp = new List[n+1];
        dp[0] = new ArrayList<>();
        if(n == 0) return dp[0];
        dp[0].add(null);
        for(int len=1; len<=n; len++){
            dp[len] = new ArrayList<>();
            for(int j=0; j<len; j++){
                for(TreeNode lNode:dp[j]){
                    for(TreeNode rNode:dp[len-j-1]){
                        TreeNode root = new TreeNode(j+1);
                        root.left  = lNode;
                        root.right = clone(rNode, j+1);
                        dp[len].add(root);
                    }
                }
            }
        }
        return dp[n];
    }

    private TreeNode clone(TreeNode node, int offset){
        if(node == null) return null;
        TreeNode copy = new TreeNode(node.val+offset);
        copy.left  = clone(node.left, offset);
        copy.right = clone(node.right, offset);
        return copy;
    }
}
// @lc code=end

