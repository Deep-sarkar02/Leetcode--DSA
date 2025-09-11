/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public static TreeNode ar_bst(ArrayList<Integer> arr , int s , int e )
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
        n.left = ar_bst(arr, s, mid-1);
        n.right = ar_bst(arr, mid+1, e);
        return n;
    }
    public TreeNode sortedListToBST(ListNode head) {
        // store all the data to the arrayList
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp = head;
        while(temp != null)
        {
            arr.add(temp.val);
            temp = temp.next;
        }
        // now all the arrayList have thedata
        return ar_bst(arr , 0 , arr.size()-1);
        
    }
}