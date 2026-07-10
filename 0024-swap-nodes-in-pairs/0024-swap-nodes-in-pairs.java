class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != null && fast != null) {
            int temp = slow.val;
            slow.val = fast.val;
            fast.val = temp;

            if (fast.next == null) {
                break;
            }

            slow = fast.next;
            fast = slow.next;
        }

        return head;
    }
}