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
    public boolean isBalanced(TreeNode root) {
        if(findHeight(root) == -1){
            return false;
        } else {
            return true;
        }
    }

    public int findHeight(TreeNode check){
        if(check == null){
            return 0;
        }

        int leftHeight = findHeight(check.left);
        int rightHeight = findHeight(check.right);

        if(leftHeight == -1 || rightHeight == -1){
            return -1;
        }
        if(Math.abs(leftHeight - rightHeight) > 1){
            return -1;
        } else {
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
}
