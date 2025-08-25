// Last updated: 25/08/2025, 17:21:58
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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> ll=new ArrayList<>();
        preorder(root,ll);
        return ll;
    }
    public void preorder(TreeNode root,ArrayList<Integer> ll){
        if(root==null){
            return;
        } 
        ll.add(root.val);
        preorder(root.left,ll);
        preorder(root.right,ll);
    }
}