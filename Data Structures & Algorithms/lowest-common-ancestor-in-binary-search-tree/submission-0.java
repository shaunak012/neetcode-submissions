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
    public boolean contains(TreeNode root, TreeNode p) {
        if(root==null) return false;
        if(root.val==p.val) return true;
        return contains(root.left,p) || contains(root.right,p);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(contains(root.left,p)&&contains(root.left,q)) {
            return lowestCommonAncestor(root.left,p,q);
        }else if(contains(root.right,p)&&contains(root.right,q)) {
            return lowestCommonAncestor(root.right,p,q);
        }
        return root;
    }
}
