// Last updated: 25/08/2025, 17:21:25
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
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
    // public TreeNode invertTree(TreeNode root) { 
    //     swap(root);
    //     return root;
    // }
    // public void swap(TreeNode root){
        // if(root==null){
        //     return;
        // }
        // TreeNode temp=invertTree(root.left);
        // root.left=invertTree(root.right);
        // root.right=temp;
    // }
}