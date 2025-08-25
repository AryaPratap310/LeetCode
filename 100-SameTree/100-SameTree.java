// Last updated: 25/08/2025, 17:22:21
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return sym(p,q);
    }
    public boolean sym(TreeNode r1,TreeNode r2){
        if(r1 ==null && r2==null){
            return true;
        }
        if(r1 ==null || r2==null){
            return false;
        }
        if(r1.val!=r2.val){
            return false;
        }
        boolean left=sym(r1.left,r2.left);
        boolean right=sym(r1.right,r2.right);
        return left && right;
    }
}