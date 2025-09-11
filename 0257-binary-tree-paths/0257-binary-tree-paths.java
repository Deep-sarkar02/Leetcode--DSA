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
    static ArrayList<String> a = new ArrayList<>();
    public static ArrayList<String> roottoleaf(TreeNode root , ArrayList<Integer>arr)
    {
        // if root is null
        if(root == null) return a;
         // now first add the root to teh aray
        arr.add(root.val);
        // base case
        if(root.left == null && root.right == null)
        {
            // now add the data of the arrayList to the a
            a.add(arr.stream()
                     .map(String::valueOf)
                     .collect(Collectors.joining("->")));
        }
        else{
            // now call for the left subtree
        roottoleaf(root.left, arr);
        // for the right
        roottoleaf(root.right, arr);
        }
        
       
        
       
        // backtract
        // remove the current or the last node
        arr.remove(arr.size() -1);
        
        return a;
    }
    public static List<String> binaryTreePaths(TreeNode root) {
        a = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        return roottoleaf(root, arr);
        
    }
}