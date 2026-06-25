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
        ListNode oneList = list1;
        ListNode twoList = list2;
        ListNode prev;
        ListNode originalPrev;
        if(list1 == null){
            return list2;
        } else if (list2 == null){
            return list1;
        }
        if(Math.min(list1.val, list2.val) == list1.val){
            originalPrev = oneList;
            prev = oneList;
            oneList = oneList.next;
        } else {
            originalPrev = twoList;
            prev = twoList;
            twoList = twoList.next;
        }
        while(oneList != null && twoList != null){
            if(oneList.val <= twoList.val){
                prev.next = oneList;
                prev = prev.next;
                oneList = oneList.next;
            } else {
                prev.next = twoList;
                prev = prev.next;
                twoList = twoList.next;
            }
        }

        if(oneList == null){
            while(twoList != null){
                prev.next = twoList;
                prev = prev.next;
                twoList = twoList.next;
            }
        } else {
            while(oneList != null){
                prev.next = oneList;
                prev = prev.next;
                oneList = oneList.next;
            }
        }
        return originalPrev;
    }
}