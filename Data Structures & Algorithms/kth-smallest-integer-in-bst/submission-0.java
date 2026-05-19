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
    public int totalNodes(TreeNode root) {
        if(root==null) return 0;
        return totalNodes(root.left)+totalNodes(root.right)+1;
    }
    public int kthSmallest(TreeNode root, int k) {
        if(root==null) return -1;
        int smallest=totalNodes(root.left)+1;
        if(smallest==k) return root.val;
        else if(smallest<k) return kthSmallest(root.right,k-smallest);
        else return kthSmallest(root.left,k);
    }
}
