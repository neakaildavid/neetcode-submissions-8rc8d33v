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
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null){
            slow = slow.next;
            fast = fast.next;
            if(fast == null){
                return false;
            }
            fast = fast.next;
            if(slow == fast){
                return true;
            }
        }

        return false;
        /*HashSet<ListNode> seen = new HashSet<>();

        while(head != null){
            if(seen.contains(head)){
                return true;
            }

            seen.add(head);
            head = head.next;
        }

        return false;

        */
    }
}
