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
        int lower = Math.min(p.val, q.val);
        int higher = Math.max(p.val, q.val);
        while(root.val < lower || root.val > higher){
            if(root.val > higher){
                root = root.left;
            }else{
                root = root.right;
            }
        }

        return root;
        
    }
}
