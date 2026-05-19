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
    int count=0;
    public void goodNodeshelper(TreeNode root,int max) {
        if(root==null) return;
        if(root.val>=max) {
            count++;
            System.out.print(max+",");
            max=root.val;
            System.out.println(max);
        }
        goodNodeshelper(root.left,max);
        goodNodeshelper(root.right,max);
    }
    public int goodNodes(TreeNode root) {
        goodNodeshelper(root,root.val);
        return count;
    }
}
