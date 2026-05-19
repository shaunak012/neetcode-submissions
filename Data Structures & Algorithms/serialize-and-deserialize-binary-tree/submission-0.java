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

public class Codec {
    String str;
    public void serializeHelper(TreeNode root) {
        if(root==null) {
            str=str + "N,";
            return;
        }
        str=str + root.val + ",";
        serializeHelper(root.left);
        serializeHelper(root.right);
    }
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        str="";
        serializeHelper(root);
        return str;
    }
    int index;
    public TreeNode deserializeHelper(String[] data) {
        if(data[index].charAt(0)=='N') return null;
        TreeNode root=new TreeNode(Integer.parseInt(data[index]));
        index++;
        root.left=deserializeHelper(data);
        index++;
        root.right=deserializeHelper(data);
        return root;
    }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        index=0;
        return deserializeHelper(data.split(","));
    }
}
