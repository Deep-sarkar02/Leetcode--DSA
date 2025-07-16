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
    TreeNode first = null;
    TreeNode last = null;
    TreeNode prev = null;
    public void helper(TreeNode root)
    {
        if(root == null)
        {
            return;
        }
        // go to left
        helper(root.left);
        // for the root
        if(prev != null)
        {
            if(prev.val > root.val)
            {
                if(first == null)
                {
                    first = prev;
                }
                last = root;
            }

        }
        // else case
        prev = root;

        // go to right
        helper(root.right);
    }
    public void recoverTree(TreeNode root) {
        helper(root);
        // swap
        if(first != null && last != null)
        {
            int temp = first.val;
            first.val = last.val;
            last.val = temp;
        }
        
    }
}