class Solution {
    public int pairSum(ListNode head) {
        int max = 0;
        int len = 0;
        LinkedList<ListNode> stack = new LinkedList<>();
        ListNode pointer = head;
        while (pointer != null) {
            len++;
            pointer = pointer.next;
        }
        pointer = head;
        for (int i = 0; i < len / 2; i++) {
            stack.offerFirst(pointer);
            pointer = pointer.next;
        }
        while (pointer != null) {
            int sum = stack.poll().val + pointer.val;
            max = Math.max(sum, max);
            pointer = pointer.next;
        }
        return max;
    }
}
