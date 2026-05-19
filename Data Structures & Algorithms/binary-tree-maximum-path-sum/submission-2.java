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
    int max;
    public int maxPathSum(TreeNode root) {
        max=root.val;
        maxPathSumHelper(root);
        return max;
    }
    public int maxPathSumHelper(TreeNode root) {
        if(root==null) return 0;
        int left=Math.max(maxPathSumHelper(root.left),0);
        int right=Math.max(maxPathSumHelper(root.right),0);
        max=Math.max(Math.max(Math.max(left+root.val,right+root.val),left+root.val+right),max);
        return Math.max(left+root.val,right+root.val);
    }
}
