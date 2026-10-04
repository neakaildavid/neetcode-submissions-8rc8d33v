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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur = head;
        int len = 0;
        while(cur != null){
            len++;
            cur = cur.next;
        }

        int k = len - n - 1;
        ListNode prev = new ListNode(0);
        cur = head;
        prev.next = cur;
        for(int i = 0; i <= k; i++){
            prev = prev.next;
            cur = cur.next;
        }
        ListNode realNext = cur.next;
        if(cur.equals(head)){
            head = head.next;
        }

        cur.next = null;
        prev.next = realNext;
        return head;


    }
}
