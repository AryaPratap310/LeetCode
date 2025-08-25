// Last updated: 25/08/2025, 17:22:16
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
    public boolean isBalanced(TreeNode root) {
        if(ht(root)!=-1){
            return true;
        }
        return false;
    }
    public int ht(TreeNode root) {
        if(root==null){
            return 0;
        }
        int lh=ht(root.left);
        if(lh==-1) return -1;
        int rh=ht(root.right);
        if(rh==-1) return -1;
        if(Math.abs(lh-rh)>1) return -1;

        // else condition
        return Math.max(lh,rh)+1;
    }





    //  -------------------------------------------------------------------------
    // public boolean isBalanced(TreeNode root) {
    // if(root==null){
    //     return true;
    // }
    // int lh=ht(root.left);
    // int rh=ht(root.right);
    // if(Math.abs(lh-rh)>1){
    //     return false;
    // }
    // // else condition
    // boolean left=isBalanced(root.left);
    // boolean right=isBalanced(root.right);
    // if(!(left && right)){
    //     return false;
    // }
    // return true;
    // }


    // public int ht(TreeNode root) {
    //     if(root==null){
    //         return 0;
    //     }
    //     int left=ht(root.left);
    //     int right=ht(root.right);
    //     return Math.max(left,right)+1;
    // }
      


    //   ---------------------------------------------------

    // O(n^2) approrach
    // public boolean isBalanced(TreeNode root) {
    //     if(root==null){
    //         return true;
    //     }
    //     boolean left=isBalanced(root.left);
    //     boolean right=isBalanced(root.right);
    //     boolean self=Math.abs(maxDepth(root.left)-maxDepth(root.right))<2?true:false;
    //     return left && right && self;
    // }
    // public int maxDepth(TreeNode root) {
    //     if(root==null){
    //         return -1;
    //     }
    //     int left=maxDepth(root.left);
    //     int right=maxDepth(root.right);
    //     return Math.max(left,right)+1;
    // }
}