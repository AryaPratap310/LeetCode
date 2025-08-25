// Last updated: 25/08/2025, 17:22:18
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return createtree(preorder,0,preorder.length-1,inorder,0,inorder.length-1, map);

    }
    public TreeNode createtree(int [] preorder,int prestart,int preend,int[] inorder,int instart,int inend,HashMap<Integer,Integer> map){
        if(prestart>preend || instart>inend){
            return null;
        }
        TreeNode root=new TreeNode(preorder[prestart]);
        int inroot=map.get(root.val);
        int numsleft=inroot-instart;
        root.left=createtree(preorder ,prestart+1,prestart+numsleft,inorder,instart,inroot-1,map);
        root.right=createtree(preorder ,prestart+numsleft+1,preend,inorder,inroot+1,inend,map);
        return root;
    }














    // public TreeNode buildTree(int[] preorder, int[] inorder) {
    //     return createtree(inorder,preorder,0,inorder.length-1,0,preorder.length-1);
    // }
    // public TreeNode createtree(int [] in,int[] pre, int ilo,int ihi,int plo,int phi){
    //     if(ilo>ihi || plo>phi){
    //         return null;
    //     }
    //     TreeNode node=new TreeNode(pre[plo]);
    //     int idx=search(in,ilo,ihi,pre[plo]);
    //     int c=idx-ilo;   //c=count
    //     node.left=createtree(in,pre,ilo,idx-1,plo+1,plo+c);
    //     node.right=createtree(in,pre,idx+1,ihi,plo+c+1,phi);
    //     return node;

    // }
    // public int search(int []in,int ilo,int ihi,int item){
    //     for(int i=ilo;i<=ihi;i++){
    //         if(in[i]==item){
    //             return i;
    //         }
    //     }
    //     return 0;
    // }
}