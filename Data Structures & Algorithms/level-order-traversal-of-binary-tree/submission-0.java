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
    public void levelOrderhelper(List<List<Integer>> list,TreeNode root,int n) {
        if(root==null) return;
        while(list.size()<=n) list.add(new ArrayList<>());
        list.get(n).add(root.val);
        levelOrderhelper(list,root.left,n+1);
        levelOrderhelper(list,root.right,n+1);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        levelOrderhelper(list,root,0);
        return list;
    }
}
