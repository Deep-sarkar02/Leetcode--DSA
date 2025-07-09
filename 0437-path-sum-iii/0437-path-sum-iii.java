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
    public int helper(TreeNode root, long k , long currsum , HashMap<Long , Integer>pa )
    {
        //base
        if(root == null)
        {
            return 0;
        }
        // work
        // find the currsum
        currsum += root.val;
        // find if the currsum - k in in the pa
        int count = pa.getOrDefault(currsum - k , 0);
        // now put the currsum in to the map
         pa.put(currsum, pa.getOrDefault(currsum, 0) + 1);

        // call for the right and the left child
        count += helper( root.left,  k ,  currsum , pa );
        count += helper( root.right,  k ,  currsum , pa );
        // now backtrack
        // delete the count of the last enterd value in the map
         pa.put(currsum , pa.get(currsum)-1);

         // return count
         return count;
    }
    public int pathSum(TreeNode root, int targetSum) {
        
        HashMap<Long , Integer>pa = new HashMap<>();
        // initialise with 0 ,1
        pa.put(0L ,1);
        return helper(root , targetSum , 0 ,pa );
        
    }
}