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
    public int height(TreeNode  root)
    {
        // base 
        if(root == null)
        {
            return 0;
        }
        // for all the case
        int lh = height(root.left);
        int rh = height(root.right);
        // now we will return the max of this
        return Math.max(lh , rh )+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null)
        {
            return 0;
        }
         int leftdim  = diameterOfBinaryTree(root.left);
         int rightdim = diameterOfBinaryTree(root.right);
         int dim_on_root = height(root.left) + height(root.right);
         return Math.max(dim_on_root , Math.max(leftdim , rightdim));
        
    }
}