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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode prevNode = head;
        while(list1 != null && list2 != null){
            int curVal = Math.min(list1.val, list2.val);
            if(curVal == list1.val){
                list1 = list1.next;
            } else {
                list2 = list2.next;
            }
            ListNode curNode = new ListNode(curVal);
            prevNode.next = curNode;
            prevNode = curNode;
        }
        if(list1 == null){
            while(list2 != null){
                prevNode.next = list2;
                prevNode = prevNode.next;
                list2 = prevNode.next;
            }
        } else {
            while(list1 != null){
                prevNode.next = list1;
                prevNode = prevNode.next;
                list1 = list1.next;
            }
        }
        return head.next;
    }
}