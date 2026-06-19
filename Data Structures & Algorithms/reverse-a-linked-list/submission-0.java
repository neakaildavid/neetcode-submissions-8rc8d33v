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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode curNode = head;
        ListNode copyNode = new ListNode(head.val, head.next);
        curNode.next = null;
        while(copyNode.next != null){
            System.out.println(1);
            ListNode nextNode = copyNode.next;
            copyNode = new ListNode (nextNode.val, nextNode.next);
            nextNode.next = curNode;
            curNode = nextNode;
        }
        return curNode;
    }
}
