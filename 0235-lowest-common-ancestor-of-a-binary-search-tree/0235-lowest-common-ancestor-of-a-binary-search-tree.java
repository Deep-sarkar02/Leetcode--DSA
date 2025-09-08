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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode n1, TreeNode n2) {
         // your code here.
        if(root == null)
        {
            return null;
        }
        //condition check
        if(root == n1 || root == n2)
        {
            return root;
        }
        // find the left lca and the right lca
        TreeNode leftlca = lowestCommonAncestor(root.left , n1 , n2);
        TreeNode rightlca = lowestCommonAncestor(root.right , n1  ,n2);
        
        // condition check
        if(leftlca != null && rightlca!= null )
        {
            return root;
        }
        else if(leftlca != null)
        {
            return leftlca;
        }
        else
        {
            return rightlca;
        }
        
    }
}