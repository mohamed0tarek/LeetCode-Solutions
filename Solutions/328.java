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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode startOdd = head;
        ListNode startEven = head.next;
        ListNode merge = startEven;
        while (startOdd.next != null && startEven.next != null){
            startOdd.next = startEven.next;
            startOdd = startOdd.next;
            startEven.next = startOdd.next;
            startEven = startEven.next;
        }
        startOdd.next = merge;
        return head;
    }
}
