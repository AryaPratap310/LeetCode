// Last updated: 25/08/2025, 17:19:00
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
    int camera=0;
    public int minCameraCover(TreeNode root) {
        int c=mincamera(root);
        if(c==-1){      //if root needs camera because root== -1 need camera
            camera++;
        }
        return camera;
    }
    public int mincamera(TreeNode root){
        if(root==null){
            return 0;
        }

        
        int left =mincamera(root.left);
        int right =mincamera(root.right);
        if (left==-1 || right==-1){   // -1 means is node pe camera ki need hai
            camera++;
            return 1;      // camera setup kra hai
        }
        if(left==1 || right==1){     //any or both child node has camera  or koi ek covered hai
            return 0;               // is covered
        }
        else{
            return -1;      //  means camera is required as both child return 0 means both are covered
        }


    }

}