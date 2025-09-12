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
class info{
    boolean isbst;
    int size;
    int min ;
    int max;
    int sum;
    info(boolean isbst , int size , int min , int max ,int sum)
    {
        this.isbst = isbst;
        this.max = max;
        this.min = min;
        this.size = size;
        this.sum = sum;
    }
}
class Solution {
    static int maxbst = 0; // this is the sum
    public info largestbst(TreeNode root) {
        // if the root == null then the min is the max val 
        // and the max is the min val
        if(root == null) return new info(true,0, Integer.MAX_VALUE, Integer.MIN_VALUE , 0);
        // get the info for the left and the right 
        info left = largestbst(root.left);
        info right = largestbst(root.right); 

        // now for the own node
        //size
        int size = left.size + right.size +1;
        int sum = left.sum + right.sum + root.val;

        // get the min
        int min = Math.min(left.min , Math.min(right.min , root.val));
        int max = Math.max(root.val,Math.max(left.max , right.max));

        // check for is bst for the root .data
        if(root.val <= left.max || root.val >= right.min)
        {
            // then false
            return new info(false, size, min, max ,0);
        }
        // check for the left and the right
        if(left.isbst && right.isbst)
        {
            // if both the left and the right are teh valid bst
            // and i am also valid bst
            // update the size of bst
            // so update the max size of the bst
            maxbst = Math.max(maxbst, sum);
           return  new info(true, size, min, max ,sum);
        }
        // if this donot happens
        // if the root is not the bst
        return new info(false, size, min, max , 0);

       

    }

     public int maxSumBST(TreeNode root) 
        {
        maxbst = 0 ;
        largestbst(root);  // call helper
        return maxbst;     // return max sum
        }
}