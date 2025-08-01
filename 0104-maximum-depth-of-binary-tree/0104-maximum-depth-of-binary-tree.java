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
    public int maxDepth(TreeNode root) {
        //base case
        if(root == null)
        {
            // if the height is calculated by node
            return 0;
        }
        // 
        int lh = maxDepth( root.left);
        int rh = maxDepth( root.right);
        // form the height of the node
        return Math.max(lh , rh)+1;
        
    }
}