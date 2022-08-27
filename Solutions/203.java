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
    public ListNode removeElements(ListNode head, int val) {
        ListNode start = new ListNode();
        start.next = head;
        ListNode slow = start;
        ListNode fast = head;
        while (fast != null){
            if (fast.val == val){
                slow.next = fast.next;
                fast = fast.next;
            } else {
                fast = fast.next;
                slow = slow.next;
            }
        }
        return start.next;
    }
}
