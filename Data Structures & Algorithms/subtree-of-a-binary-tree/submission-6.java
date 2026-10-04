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
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();

            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                if(node.val == subRoot.val){
                    if(checkTree(node, subRoot)){
                        return true;
                    }
                }
                if(node.right != null){
                    queue.offer(node.right);
                }

                if(node.left != null){
                    queue.offer(node.left);
                }
            }
        }

        return false;
    }

        private boolean checkTree(TreeNode root, TreeNode subroot){
            Queue<TreeNode> subQueue = new LinkedList<>();
            Queue<TreeNode> queue = new LinkedList<>();

            subQueue.add(subroot);
            queue.add(root);

            while(!subQueue.isEmpty() && !queue.isEmpty()){
                for(int i = subQueue.size(); i > 0; i--){
                    TreeNode subNode = subQueue.poll();
                    TreeNode mainNode = queue.poll();
                    if(subNode == null && mainNode == null){
                        continue;
                    }

                    if(subNode == null || mainNode == null  || subNode.val != mainNode.val){
                        return false;
                    }

                    subQueue.add(subNode.right);
                    subQueue.add(subNode.left);
                    queue.add(mainNode.right);
                    queue.add(mainNode.left);
                }
            }

            return true;
        }
    
}
