// Last updated: 25/08/2025, 17:21:36
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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ll=new ArrayList<>();
        view(root,ll,1);
        return ll;
    }
    int maxlevel=0;
    public void view(TreeNode r,List<Integer> ll,int currlevel){
        if(r==null){
            return;
        }
        if(currlevel>maxlevel){
            ll.add(r.val);
            maxlevel++;  // maxlevel=cl;
        }
        view(r.right,ll,currlevel+1);
        view(r.left,ll,currlevel+1);
    }

}