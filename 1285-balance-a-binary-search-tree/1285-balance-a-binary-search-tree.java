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
    public static void getinorder(TreeNode root , ArrayList<Integer> ar)
    {
        //base
        if(root == null) return ;
        getinorder(root.left ,ar);
        ar.add(root.val);
        getinorder(root.right , ar);
    }
    public static TreeNode l_bst(ArrayList<Integer> arr , int s , int e )
    {
        // base
        if(s>e)
        {
            return  null;
        }
        // fidn the mid
        int mid = (s + e)/2;
        // make the node for the mid
        TreeNode n = new TreeNode(arr.get(mid));
        // now for the left and the right
        n.left = l_bst(arr, s, mid-1);
        n.right = l_bst(arr, mid+1, e);
        return n;
    }
    public TreeNode balanceBST(TreeNode root) {
        // from the inorder seq 
        ArrayList<Integer> ar= new ArrayList<>();
        // do the inorder and store the data in the array
        getinorder(root, ar);
        // now the array will habe the inorder
        root =  l_bst(ar, 0, ar.size()-1);
        // then form the bst from the inorder array
        return root;
    }
}