import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=1339 lang=java
 *
 * [1339] Maximum Product of Splitted Binary Tree
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
    HashMap<TreeNode, Long> map = new HashMap<>();
    public int maxProduct(TreeNode root) {
        long s = getSum(root);
        long res = 0;
        Queue<TreeNode> front = new LinkedList<>();
        front.add(root);
        while(!front.isEmpty()){
            TreeNode next = front.poll();
            if(next.left!=null){
                long left = map.get(next.left);
                res = Math.max(res, ((s-left)*left));
                front.add(next.left);
            }
            if(next.right!=null){
                long right = map.get(next.right);
                res = Math.max(res, ((s-right)*right));
                front.add(next.right);
            }
        }
        return (int)(res%(int)(1e9 + 7));


    }

    private long getSum(TreeNode node){
        if(node == null) return 0;
        long sum = ((long)(node.val))+getSum(node.left)+getSum(node.right);
        map.put(node, sum);
        return sum;
    }
}
// @lc code=end

