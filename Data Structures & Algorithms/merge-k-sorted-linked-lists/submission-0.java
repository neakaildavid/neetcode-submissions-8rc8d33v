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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length <= 0){
            return null;
        }
        ListNode head = lists[0];
        for(int i = 1; i < lists.length; i++){
            head = mergeTwoLists(head, lists[i]);
        }
        return head;
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode prevNode = head;
        ListNode curNode;
        while(list1 != null || list2 != null){
            if(list1 == null){
                curNode = list2;
                list2 = list2.next;
            } else if (list2 == null || list1.val <= list2.val){
                curNode = list1;
                list1 = list1.next;
            } else {
                curNode = list2;
                list2 = list2.next;
            }
            prevNode.next = curNode;
            prevNode = curNode;
        }
        
        return head.next;
    }
}
