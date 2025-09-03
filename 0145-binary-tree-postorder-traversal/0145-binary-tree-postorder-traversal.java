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
    public List<Integer> postorderTraversal(TreeNode root) {
        // base case
        List<Integer> l = new LinkedList<>();
        if(root == null)
        {
            //System.out.println("XX");
            return l; 
        }
        // work
        // left subtree
        l.addAll(postorderTraversal(root.left));

         // right 
        l.addAll(postorderTraversal(root.right)); 

        // root print
        l.add(root.val);
        //System.out.println("/     '\'" );
        return l;
    }
}