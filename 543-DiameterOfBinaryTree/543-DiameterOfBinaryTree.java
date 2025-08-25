// Last updated: 25/08/2025, 17:20:10
class Solution {

    // O(n) approach
    public int diameterOfBinaryTree(TreeNode root) {
        int maxd[]=new int[1];
        ht(root,maxd);
        return maxd[0];
    }
    public int ht(TreeNode root,int [] maxd){
        if(root==null){
            return 0;
        }
        int lh=ht(root.left,maxd);
        int rh=ht(root.right,maxd);
        maxd[0]=Math.max(maxd[0],lh+rh);
        return Math.max(lh,rh)+1;
    }

//  // O(n^2) approach
    // public int diameterOfBinaryTree(TreeNode root) {
    //     return dia(root);
    // }
    // public int ht(TreeNode root){
    //     if(root==null){
    //         return -1;
    //     }
    //     int lh=ht(root.left);
    //     int rh=ht(root.right);
    //     return Math.max(lh,rh)+1;
    // }
    // public int dia(TreeNode root){
    //     if(root==null){
    //         return 0;
    //     }
    //     int leftdia=dia(root.left);
    //     int rightdia=dia(root.right);
    //     int selfdia=ht(root.left)+ht(root.right)+2;
    //     return Math.max(selfdia,Math.max(leftdia,rightdia));
    // }
    
}