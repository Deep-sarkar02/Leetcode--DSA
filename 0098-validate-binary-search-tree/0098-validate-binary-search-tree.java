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
    public boolean helper(TreeNode root , Integer min , Integer max)
    {
        // base 
        if(root == null)
        {
            return true;
        }
        // work
        // min check
        if(min != null && root.val <= min)
        {
            return false;
        }
        if(max != null && root.val >= max)
        {
            return false;
        }
        // now we will return 
        return helper(root.left , min , root.val) && helper(root.right , root.val , max);
    }
    public boolean isValidBST(TreeNode root) {
        return helper(root , null , null);
        
    }
}