import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=94 lang=java
 *
 * [94] Binary Tree Inorder Traversal
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
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> res = new ArrayList<>();

        if(root==null) return res;
        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode n = stack.pop();
            if(n==null) continue;
            if(n.left == null && n.right == null) res.add(n.val);
            else{
                TreeNode left = n.left, right = n.right;
                n.left = null;
                n.right = null;
                stack.push(right);
                stack.push(n);
                stack.push(left);
            }
        }
        return res;
    }
}
// @lc code=end

