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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        } else if (p == null || q == null){
            return false;
        }
        Queue<TreeNode> pq = new ArrayDeque<>();
        Queue<TreeNode> qq = new ArrayDeque<>();

        pq.offer(p);
        qq.offer(q);

        while(!pq.isEmpty() && !qq.isEmpty()){
            int sizeP = pq.size();
            int sizeQ = qq.size();

            if(sizeP != sizeQ){
                return false;
            }

            for(int i = 0; i < sizeP; i++){
                TreeNode nodeP = pq.poll();
                TreeNode nodeQ = qq.poll();

                if(nodeP.val != nodeQ.val){
                    return false;
                }

                if(nodeP.left != null && nodeQ.left != null){
                    pq.offer(nodeP.left);
                    qq.offer(nodeQ.left);
                } else if (!(nodeP.left == null && nodeQ.left == null)){
                    return false;
                }

                if(nodeP.right != null && nodeQ.right != null){
                    pq.offer(nodeP.right);
                    qq.offer(nodeQ.right);
                } else if (!(nodeP.right == null && nodeQ.right == null)){
                    return false;
                }

            }
        }

        if(!pq.isEmpty() || !qq.isEmpty()){
            return false;
        }

        return true;
    }
}
