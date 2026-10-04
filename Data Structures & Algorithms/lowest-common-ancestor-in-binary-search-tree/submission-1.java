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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int higher = Math.max(p.val, q.val);
        int lower = Math.min(p.val, q.val);
        while(root != null){
            if(higher >= root.val && root.val >= lower){
                return root;
            } else if(lower > root.val){
                root = root.right;
            } else {
                root = root.left;
            }
        }

        return root;
    }
}
