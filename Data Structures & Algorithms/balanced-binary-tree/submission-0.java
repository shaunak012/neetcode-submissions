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
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
    public boolean isBalanced(TreeNode root) {
        if (root==null) return true;
        int height=maxDepth(root.left)-maxDepth(root.right);
        if(height<=1 && height>=-1){
            return (isBalanced(root.left) && isBalanced(root.right));
        }
        return false;
    }
}
