class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode begin = dummy;
        ListNode ptr = head.next;
        int count =0;
        while (ptr != null){
            if(ptr.val != 0){
                count += ptr.val;
            } else {
                begin.next = new ListNode(count);
                begin = begin.next;
                count = 0;
            }
            ptr = ptr.next;
        }
        return dummy.next;
    }
}
