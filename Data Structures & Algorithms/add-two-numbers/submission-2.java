/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }

 15 + 16 = 31

 5 -> 1  6 -> 1  1 -> 3

 5 + 6 = 11
 11/10 = 1 = carry
 11 % 10 = 1 -> node

 1 + 1 + 1 = 3
 3/10 = 0 = carry
 3 % 10 = 3 -> node
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        int carry = 0;
        while(l1 != null || l2 != null || carry == 1){
            int sum = 0;
            if(l1 == null && l2 == null){
                sum = carry;
            } else if (l1 == null) {
                sum = carry + l2.val;
                l2 = l2.next;
            } else if (l2 == null){
                sum = carry + l1.val;
                l1 = l1.next;
            } else {
                sum = l1.val + l2.val + carry;
                l1 = l1.next;
                l2 = l2.next;
            }
            carry = sum/10;
            int place = sum % 10;
            cur.next = new ListNode(place);
            cur = cur.next;
        }

        return dummy.next;

    }
}
