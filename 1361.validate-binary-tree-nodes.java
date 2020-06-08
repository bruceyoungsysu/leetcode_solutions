import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode id=1361 lang=java
 *
 * [1361] Validate Binary Tree Nodes
 */

// @lc code=start
class Solution {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        int[] inDegree = new int[n];
        int[] outDegree = new int[n];
        Set<Integer> seen = new HashSet<>();
        for(int i=0; i<n; i++){
            int left = leftChild[i];
            int right = rightChild[i];
            if(left!=-1){
                seen.add(left);
                inDegree[left]++;
                outDegree[i]++;
                if(inDegree[left]>=2) return false;
            }
            if(right!=-1){
                seen.add(right);
                inDegree[right]++;
                outDegree[i]++;
                if(inDegree[right]>=2) return false;
            }
            if(outDegree[i]>=3) return false;
            
        }
        if(n-seen.size()!=1) return false;
        for(int j=0; j<n; j++){
            if(!seen.contains(j)){
                if(outDegree[j]==0 && n!=1) return false;
            }
        }
        return true;
    }
}
// @lc code=end

