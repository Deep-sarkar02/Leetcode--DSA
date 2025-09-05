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
    public static boolean issame(TreeNode root , TreeNode sr)
    {
        // if both of them data are null
        if(root == null && sr == null) // if both of them are null
         {
            return true;
        }
        // elsse if
        else if(root == null || sr == null || root.val != sr.val)
        {
            return false;
        }
        // check for the left and the right part
        if(! issame(root.right, sr.right)) return false;
        if(! issame(root.left, sr.left)) return false;
        // else case
        return  true;


    }
    public boolean isSubtree(TreeNode root, TreeNode sr) 
    {
        // base
        if(root == null) return false;
        // first chek that if the root data is same
        if(root.val == sr.val)
        {
            // now check the full data 
            if(issame(root , sr))
            {
                return true;
            }
        }
        // elif
        // we will check for the left sub tree and the right subtree
        return isSubtree(root.left, sr) || isSubtree(root.right, sr);
        
    }
}