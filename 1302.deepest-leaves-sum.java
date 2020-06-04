import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=1302 lang=java
 *
 * [1302] Deepest Leaves Sum
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
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> front = new LinkedList<>();
        front.offer(root);
        int ans = 0;
        while(front.size()>0){
            
            int temp = 0;
            int size = front.size();
            for(int i=0; i<size; i++){
                TreeNode node = front.poll();
                temp += node.val;
                if(node.left!=null) front.offer(node.left);
                if(node.right!=null) front.offer(node.right);
            }
            ans = temp;
            
        }
        return ans;
    }
}
// @lc code=end

