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
    public static TreeNode i_o_s(TreeNode root)
    {
        // ios will be the left most node in the right subtree
        // right subtree is given 
        // we will go to  the left of the tree untill null
        while(root.left != null)
        {
            root = root.left;
        }
        // return the root
        return root;
    }
    public TreeNode deleteNode(TreeNode root, int val) {
        // search the node to delete
        if(root == null) return null;
        if(val < root.val)
        {
            // then check in the root -> left
            root.left = deleteNode(root.left, val);
        }
        // if the val > root.data
        else if(root.val < val)
        {
            // check for root -> left
            root.right = deleteNode(root.right, val);
        }
        // else case
        // if the root.data == value
        else
        {
            // when the root is the value
            // case -1
            // leaf node
            if(root.left == null && root.right == null)
            {
                // if it is the leaf node
                // return null to the parent
                return null;
            }

            // case -2
            // single child
            if(root.left == null)
            {
                // return the right child to the parent
                return root.right;
            }
            else if(root.right == null)
            {
                return root.left;
            }


            // case 3
            // if both the children exists
            // fidn the inorder successor
            // pass the root.right to the function 
            // since ios is the left most node of the right subtree
            TreeNode is = i_o_s(root.right);
            //make the root.data to the ios data
            root.val = is.val;
            // now delete the inorder successor
            root.right = deleteNode(root.right , is.val); // now delete that node from the root.right
            //and now the  the node will be deleted from the right subtree 
        }
        // return 
        return root;
    }
}