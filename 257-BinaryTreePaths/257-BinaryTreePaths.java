// Last updated: 25/08/2025, 17:21:12
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
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> ll=new ArrayList<>();
        String ans="";
        path(root,ll,ans);
        // path(root.right,ll,ans);
        return ll;
    }
    public void path(TreeNode root,ArrayList<String> ll,String ans){
       if(root==null){
        return ;
       }
        ans+=""+root.val;
        if(root.left==null && root.right==null){
            // ans+="->"+root.val;
            ll.add(ans);
            return;
        }
        ans+="->";
        path(root.left,ll,ans);
        path(root.right,ll,ans);

    }
}