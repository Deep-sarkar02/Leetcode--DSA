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
    // global var
    int prevorder = 0;
    public int kthSmallest(TreeNode root, int k) {
        return helper(root , k);
    }
    int helper(TreeNode root , int k)
    {
        // base case
        if(root  == null)
        {
            return -1;
        }
        // for the left tree
        if(root.left != null)
        {
            int leftans = helper(root.left , k);
            if(leftans != -1)
            {
                return leftans;
            }
        }
        // for the root
        if(prevorder +1 == k){
            return root.val;
        }
        else
        {
            prevorder +=1 ;  
        }
        // for th right node
        if(root.right != null)
        {
            int rightans = helper(root.right , k);
            if(rightans != -1)
            {
                return rightans;
            }
        }
        // else
        return -1;
    }
}