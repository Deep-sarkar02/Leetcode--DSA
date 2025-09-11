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
    public static TreeNode ar_bst(int[] arr , int s , int e )
    {
        // base
        if(s>e)
        {
            return  null;
        }
        // fidn the mid
        int mid = (s + e)/2;
        // make the node for the mid
        TreeNode n = new TreeNode(arr[mid]);
        // now for the left and the right
        n.left = ar_bst(arr, s, mid-1);
        n.right = ar_bst(arr, mid+1, e);
        return n;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return ar_bst(nums , 0 , nums.length-1);
    }
}