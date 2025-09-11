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
    static int sum = 0 ;
    public static int inrange(TreeNode root , int a , int b)
    {
        // base
        if(root == null) return 0 ;
        // case1
        if(root.val >= a && root.val <= b)
        {
            //check for left and right and then 
            inrange(root.left, a, b);
            sum += root.val;
            // right
            inrange(root.right, a, b);
        }
        // for the left 
        else if(root.val < a)
        {
            // for the left
            inrange(root.right, a, b);
        }
        else
        {
            // for the right
            inrange(root.left, a, b);
        }
        return sum;
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
         sum = 0 ;
        inrange(root , low , high);
        return sum;   
    }
}