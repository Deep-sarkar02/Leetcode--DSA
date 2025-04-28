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
    public boolean helper(TreeNode r1 , TreeNode r2)
    {
        if(r1 == null && r2 == null) return true;
        if(r1 == null || r2 == null) return false;

        return(r1.val == r2.val && helper(r1.left , r2.right) && helper(r1.right , r2.left));
    }
    public boolean isSymmetric(TreeNode root) {
        // if there is no child then rettrn true
        if(root.left  == null && root.right  == null)
        {
            return true;
        }
        // else we wil return the helper function
        return helper(root.left , root.right);
        
    }
}