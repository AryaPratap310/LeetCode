// Last updated: 25/08/2025, 17:19:03
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
    public boolean flipEquiv(TreeNode r1, TreeNode r2) {
       if(r1==null&& r2==null){
            return true;
        }
        if(r1==null || r2==null){
            return false;
        }
        if(r1.val!=r2.val){
            return false;
        }
    
        // if no flip then code of equality
        // if flip then code of mirror
        boolean flip=flipEquiv(r1.left,r2.right)  &&  flipEquiv(r1.right,r2.left);
        boolean noflip=flipEquiv(r1.left,r2.left) && flipEquiv(r1.right,r2.right);
        return flip || noflip;
    }
}