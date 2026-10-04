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
        List<List<Integer>> traversal = new ArrayList<>();
        if(root == null){
            return traversal;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            List<Integer> curLevel = new ArrayList<>();
            int size = queue.size();

            for(int i = 0; i < size; i++){
                TreeNode curNode = queue.poll();
                curLevel.add(curNode.val);

                if(curNode.left != null){
                    queue.offer(curNode.left);
                }

                if(curNode.right != null){
                    queue.offer(curNode.right);
                }
            }

            traversal.add(curLevel);
        }

        return traversal;
    }
}
