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

class Solution {
    public void reorderList(ListNode head) {
        HashMap<Integer, ListNode> indices = new HashMap<Integer, ListNode>();
        int i = 0;
        ListNode cur = head;
        while(cur != null){
            indices.put(i, cur);
            cur = cur.next;
            i++;
        }

        int length = i;
        int away = 1;
        ListNode curNode = head;
        boolean nextRight = true;
        while(away <= length - away){
            if(nextRight){
                ListNode nextNode = indices.get(length - away);
                curNode.next = nextNode;
                curNode = nextNode;
                nextRight = false;
            } else {
                ListNode nextNode = indices.get(away);
                curNode.next = nextNode;
                curNode = nextNode;
                nextRight = true;
                away++;
            }

        }
        curNode.next = null;

    }
}
