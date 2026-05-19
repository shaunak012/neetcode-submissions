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
    public int heightOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        return Math.max(heightOfBinaryTree(root.left),heightOfBinaryTree(root.right))+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int max=heightOfBinaryTree(root.left)+heightOfBinaryTree(root.right);
        return Math.max(Math.max(max,diameterOfBinaryTree(root.left)),diameterOfBinaryTree(root.right));
    }
}
