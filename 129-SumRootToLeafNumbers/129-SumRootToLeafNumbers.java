// Last updated: 25/08/2025, 17:22:05
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
    static int totalsum=0;
    public int sumNumbers(TreeNode root) {
       return Sum(root,0);
    }

    public int Sum(TreeNode r1,int sum){
        if(r1==null){
            return 0;
        }
        if(r1.left==null && r1.right==null){
            return sum*10+r1.val;
        }
        int l=Sum(r1.left,sum*10+r1.val);
        int r=Sum(r1.right,sum*10+r1.val);
        return l+r;
    }
}