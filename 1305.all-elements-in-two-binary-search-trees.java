import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * @lc app=leetcode id=1305 lang=java
 *
 * [1305] All Elements in Two Binary Search Trees
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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        Queue<Integer> q1 = preorder(root1, new LinkedList<>());
        Queue<Integer> q2 = preorder(root2, new LinkedList<>());
        List<Integer> res = new ArrayList<>();
        while(!q1.isEmpty() && !q2.isEmpty()){
            if(q1.peek()<=q2.peek()){
                res.add(q1.poll());
            }
            else{
                res.add(q2.poll());
            }
        }
        while(!q1.isEmpty()){
            res.add(q1.poll());
        }
        while(!q2.isEmpty()){
            res.add(q2.poll());
        }
        return res;
        
    }
    private Queue<Integer> preorder(TreeNode node, Queue<Integer> q){
        if(node == null) return q;
        if(node.left!=null){
            q = preorder(node.left, q);
        }
        q.offer(node.val);
        if(node.right!=null){
            q = preorder(node.right, q);
        }
        return q;
    }
}
// @lc code=end

