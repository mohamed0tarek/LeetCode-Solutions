class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ptr1 = head;
        ListNode ptr2 = head;
        int len =0;
        if(head == null || head.next == null)
            return null;
        while (len < n){
            ptr2 = ptr2.next;
            len++;
        }
        if(ptr2 == null)
            return head = head.next;
        while (ptr2.next != null){
            ptr2 = ptr2.next;
            ptr1 = ptr1.next;
        }
        ptr1.next = ptr1.next.next;
        return head;
    }
}
