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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null){
            return false;
        }
        if(root.val == subRoot.val){
            boolean check = isSameTree(root, subRoot);
            if(check == false){
                return (isSubtree(root.left, subRoot)) || ((isSubtree(root.right, subRoot)));
            } else{
                return true;
            }
        } else{
            return isSubtree(root.left, subRoot) || (isSubtree(root.right, subRoot));
        }
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean check = true;
        if(p == null && q == null){
            return true;
        } else if (p == null || q == null){
            return false;
        } else if (p.val == q.val){
            check = isSameTree(p.left, q.left);
            if(isSameTree(p.right, q.right) == false){
                check = false;
            }
            return check;
        } else {
            return false;
        }
    }
    
}
