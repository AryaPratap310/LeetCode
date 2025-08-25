// Last updated: 25/08/2025, 17:21:57
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
    public List<Integer> postorderTraversal(TreeNode root) {
     ArrayList<Integer> ll=new ArrayList<>();
        inorder(root,ll);
        return ll;
    }
    public void inorder(TreeNode root,ArrayList<Integer> ll){
        if(root==null){
            return;
        } 
        inorder(root.left,ll);
        inorder(root.right,ll);
        ll.add(root.val);
    }
}