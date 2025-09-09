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
     public static TreeNode insert(TreeNode root , int val)
    {
        // if the root == null
        if(root == null)
        {
            // create the new root
            // make it bst root
            root = new TreeNode(val);
            return root;
        }

        // check the value
        if(val>  root.val)
        {
            // go for the right 
            root.right = insert(root.right, val);
        }
        else
        {
            root.left = insert(root.left, val);
        }

        return root;
    }
    public TreeNode bstFromPreorder(int[] values) {
        TreeNode root = null; // initially the root will be null

        // loop 
        for(int i= 0 ; i <values.length ; i++)
        {
            root = insert(root, values[i]);   
        }

        return root;
    }
}