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
    int p_i = 0 ;
    public int Search(int[] i , int l_i , int r_i , int v )
    {
        // seearch
        for (int in = l_i ; in<=r_i ; in++ )
        {
            if(i[in] == v)
            {
                // return idex
                return in;
            }
        }
        return -1;
    }

    public TreeNode helper(int[] p, int[] i, int l_i , int r_i)
    {
        // base
        if(l_i > r_i)
        {
            return null;
        }
        // works
        // from the first node of the preorder create the first node
        TreeNode root = new TreeNode(p[p_i]);
        // now call for  the next value of the preorder
        p_i++;
        // now we will search the value of the root on the inorder array
        // and return the index
        int Ind = Search(i , l_i , r_i , root.val);
        // if we found this value then create the left and the right subtree
        root.left = helper( p, i, l_i ,  Ind -1) ; // we will stop till left of the left index
        root.right = helper( p, i , Ind +1 ,  r_i) ;

        // now return the root
        return root;

    }
    public TreeNode buildTree(int[] preorder, int[] inorder) 
    {
        
        return helper(preorder ,inorder , 0 , inorder.length-1);
    }
}