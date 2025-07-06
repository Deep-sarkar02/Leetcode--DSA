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
    int maxsum = Integer.MIN_VALUE;
    public int helper(TreeNode root)
    {
        // base
        if(root == null)
        {
            return 0;
        }
        // work
        // find the path sum for the left and the right
        // only the value over 0 ie , non neg
        int left = Math.max(0 , helper(root.left));
        int right = Math.max(0 , helper(root.right));
        // now we will store the left and the right and the ndoe valeu in the max
        maxsum = Math.max(maxsum , root.val + left+ right);

        // now we will return the max(left ,righ) + node sum ie the path sum
        return (Math.max(left , right) + root.val);
    }
    public int maxPathSum(TreeNode root) {
        helper(root);
        return maxsum;        
    }
}