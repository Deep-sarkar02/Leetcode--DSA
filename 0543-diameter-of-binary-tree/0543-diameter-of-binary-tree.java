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
class info // this class will be used in the function
{ 
    // 2 var
    int diam;
    int ht;

    info(int d , int h)
    {
        this.diam = d;
        this.ht = h;
    }
}

class Solution {
    // now we will find the diameter -- O(n)
    public static info dim(TreeNode root)
    {
        // base case
        if(root == null)
        {
            return new info(0, 0);
        }

        // get the info of the left and the right
        info lf = dim(root.left);
        info rg = dim(root.right);

        // now calculate the diameter
        // fidn the self diamter
        int sd = lf.ht + rg.ht+1;

        // get the diameter
        int diam = Math.max(sd, Math.max(lf.diam, rg.diam ) );
        // also get the height
        int ht = Math.max(lf.ht , rg.ht)+1;

        // now return the ht and the diam
        return new info(diam, ht);
        
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
        
         return (dim(root).diam)-1;
        
    }
}