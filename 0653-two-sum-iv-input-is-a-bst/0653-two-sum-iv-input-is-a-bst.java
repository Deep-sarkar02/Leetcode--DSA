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
    public boolean findTarget(TreeNode root, int k) {
        // use the set here
        Set<Integer>s = new HashSet<>();
        return helper(root , k , s);
    }
    public boolean helper(TreeNode root, int k, Set<Integer>s )
    {
        // base 
        if(root == null)
        {
            return false;
        }
        //go to the left
        if(helper(root.left , k , s))
        {
            return true;
        }
        // for the root
        if(s.contains(k - root.val))
        {
            return true;
        }
        s.add(root.val);
        // for theright
        return helper(root.right , k , s);
    }
}