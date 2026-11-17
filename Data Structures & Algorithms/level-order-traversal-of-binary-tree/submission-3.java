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
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new ArrayDeque<>();

        if(root == null){
            return res;
        }
        q.offer(root);

        while(!q.isEmpty()){
            int curSize = q.size();
            List<Integer> curLevel = new ArrayList<>();
            for(int i = 0; i < curSize; i++){
                TreeNode cur = q.poll();
                curLevel.add(cur.val);
                TreeNode left = cur.left;
                TreeNode right = cur.right;

                if(left != null){
                    q.offer(left);
                }

                if(right != null){
                    q.offer(right);
                }
            }
            res.add(curLevel);
        }

        return res;
    }
}
