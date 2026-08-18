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
    public boolean isValidBST(TreeNode root) {
        return validHelper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean validHelper(TreeNode root, int lower, int upper){
        if(root.left == null || root.right == null){
            if(root.left == null && root.right == null){
                return true;
            } else if (root.left == null){
                if(root.right.val <= root.val || root.right.val <= lower || root.right.val >= upper){
                    return false;
                } else {
                    return validHelper(root.right, root.val, upper);
                }
            } else {
                if(root.left.val >= root.val || root.left.val >= upper || root.left.val <= lower ){
                    return false;
                } else{
                    return validHelper(root.left, lower, root.val);
                }
            }
        }

        boolean leftCheck = false;
        boolean rightCheck = false;
        if(root.left.val < upper && root.left.val > lower && root.left.val <  root.val){
            leftCheck = validHelper(root.left, lower, root.val);
        }
        if(root.right.val > lower && root.right.val < upper && root.right.val > root.val){
            rightCheck = validHelper(root.right, root.val, upper);
        }
        return leftCheck && rightCheck;


    }
}
