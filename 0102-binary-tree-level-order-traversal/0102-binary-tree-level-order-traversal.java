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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        // form the ans
        List<List<Integer>> ans = new ArrayList<>();
        // edge case
        if(root == null) return ans;
        // insert the root to the queue
        q.add(root);
        // now we will remove the elem from the queue and till it s made empty
        while(!q.isEmpty())
        {
            // now find the size of the queue
            int s = q.size();
            // this is the size of each level
            // now we will add the valeu to the res
            List<Integer> res = new ArrayList<>();
            for(int i = 0 ; i< s ; i++)
            {
            // we will remove the emep from the q
            // and insert the elem to the array
            TreeNode temp = q.poll();
            
            res.add(temp.val);
            if(temp.left != null)
            {
                q.add(temp.left);
            }
            if(temp.right != null)
            {
                q.add(temp.right);
            }

            }
            // now we will push the chotoarr tot eh big array
            ans.add(res);
            
        }
        return ans;
        
        
    }
}