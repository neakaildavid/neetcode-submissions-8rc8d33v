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
        int length = 0;
        ListNode copy = head;
        while(copy != null){
            length++;
            copy = copy.next;
        }
        int num = length - n;
        ListNode prev;
        ListNode next;
        copy = head;
        for(int i = 0; i < num-1; i++){
            copy = copy.next;
        }
        if(copy == head){
            if(copy.next == null){
                return null;
            } else if (num == 0){
                return head.next;
            }
        }
        prev = copy;
        copy = copy.next;
        prev.next = copy.next;
        return head;
    }
}
