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
    public List<Integer> preorderTraversal(TreeNode root) 
    {
        // base case
        List<Integer> l = new LinkedList<>();
        if(root == null)
        {
            //System.out.println("XX");
            return l;
        }
        // work
        // root print
        l.add(root.val);
        //System.out.println("/     '\'" );
        // left subtree
        l.addAll(preorderTraversal(root.left));
        // right 
        l.addAll(preorderTraversal(root.right));
        return l;
    }
}