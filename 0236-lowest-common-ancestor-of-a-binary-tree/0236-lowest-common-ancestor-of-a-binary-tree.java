/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // BASE CASE
        if(root == null)
        {
            return null;
        }
        // find the condition chekc
        if(root == p || root == q)
        {
            return root;
        }
        // go to each of the level and find the left lca and the right lca
        TreeNode leftlca = lowestCommonAncestor( root.left,  p,q);
        TreeNode rightlca = lowestCommonAncestor( root.right,  p,q);
        // now wewill chekc the condition
        if(leftlca != null && rightlca!= null)
        {
            return root;
        }
        else if(leftlca!= null)
        {
            return leftlca;
        }
        else
        {
            return rightlca;
        }
        
    }
}