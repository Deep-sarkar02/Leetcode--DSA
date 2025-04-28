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
    public TreeNode invertTree(TreeNode root) {
        // base case:=
        if(root == null)
        {
            return root;
        }
        // now go to teh left 
        invertTree(root.left);
        // call the right
        invertTree(root.right);
        // if the base cals not match then 
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        return root;
        
    }
}