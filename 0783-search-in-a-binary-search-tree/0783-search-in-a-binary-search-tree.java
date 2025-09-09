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
    public TreeNode searchBST(TreeNode root, int k) {
       // base
        if(root == null) return null ; // go to the parent
        if(root.val == k) return root; // go to the parent

        // for the left
        if(k < root.val)
        {
            return  searchBST(root.left, k); // pass thsi to parent
        }
        else
        {
            return searchBST(root.right, k);
        }
        
    }
}