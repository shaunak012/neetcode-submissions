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
    public boolean isValidBSThelper(TreeNode root,int min,int max) {
        if(root==null) return true;
        if(root.val<max &&root.val>min){
            return isValidBSThelper(root.left,min,root.val) && isValidBSThelper(root.right,root.val,max);
        }
        return false;
    }
    public boolean isValidBSLeft(TreeNode root,int max) {
        if(root==null) return true;
        if(root.val<max){
            return isValidBSLeft(root.left,root.val) && isValidBSThelper(root.right,root.val,max);
        }
        return false;
    }
    public boolean isValidBSTRight(TreeNode root,int min) {
        if(root==null) return true;
        if(root.val>min){
            return isValidBSThelper(root.left,min,root.val) && isValidBSTRight(root.right,root.val);
        }
        return false;
    }
    public boolean isValidBST(TreeNode root) {
        if(root==null) return true;
        return isValidBSLeft(root.left,root.val) && isValidBSTRight(root.right,root.val);
    }
}
