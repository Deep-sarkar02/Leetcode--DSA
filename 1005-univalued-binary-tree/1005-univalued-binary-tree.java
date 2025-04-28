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
    public boolean isUnivalTree(TreeNode root) {
        // base case 
        // if the root is null then return true
        // since each of the root will become null at a point of time
        if (root == null)
        {
            return true;
        }
        // else go  the left of the root 
        // base case :2
        if(root.left != null && root.left.val != root.val)
        {
            // if not null and then check if the val is not true
            return false;
        }
        // base case 3:
        if(root.right != null && root.right.val != root.val)
        {
            // if not null and then check if the val is not true
            return false;
        }
        // if this not happen
        boolean leftAns = isUnivalTree(root.left);
        // if the left ans is flase then it is flase;
        if(leftAns == false)
        {
            return false;
        }
        boolean rightAns = isUnivalTree(root.right);
        return rightAns;
        
    }
}