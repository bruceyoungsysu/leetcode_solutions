import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=1382 lang=java
 *
 * [1382] Balance a Binary Search Tree
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
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> nodes = new ArrayList<>();
        preorder(root, nodes);
        System.out.println(nodes.size());
        TreeNode newRoot = buildBalanced(nodes);
        return newRoot;
    }

    private void preorder(TreeNode node, List<Integer> nodes){
        if(node==null) return;
        preorder(node.left, nodes);
        nodes.add(node.val);
        preorder(node.right, nodes);
    }

    private TreeNode buildBalanced(List<Integer> nodes){
        if(nodes.size()==0) return null;
        int mid = nodes.size()/2;
        TreeNode node = new TreeNode(nodes.get(mid));
        node.left = buildBalanced(nodes.subList(0, mid));
        node.right = buildBalanced(nodes.subList(mid+1, nodes.size()));
        return node;
    }
}
// @lc code=end

