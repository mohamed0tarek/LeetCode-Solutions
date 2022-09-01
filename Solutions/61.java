class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null ) return head;
        ListNode slow = head;
        ListNode fast = head;
        for (int i =0; i< k ;i++){
            fast = fast.next;
            if(fast == null)
                fast = head;
        }
        while (fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = head;
        head = slow.next;
        slow.next = null;
        return head;
    }
}
