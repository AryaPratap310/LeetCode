// Last updated: 30/08/2025, 01:11:54
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
    int min=Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        if(root==null){           // if root is null , no tree 
            return 0;
        }
        height(root,1);
        return min;
    }
    public void height(TreeNode root,int cl){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            min=Math.min(min,cl);
            return;
        }
        height(root.left,cl+1);
        height(root.right,cl+1);
         
    }
}