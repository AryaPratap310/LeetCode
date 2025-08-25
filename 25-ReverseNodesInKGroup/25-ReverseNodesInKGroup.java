// Last updated: 25/08/2025, 17:23:10
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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null || k == 1) return head;

        ListNode dummy = new ListNode(0); // \U0001f9f1 Dummy node
        dummy.next = head;
        ListNode pre = dummy;
        int size = len(head); // \U0001f522 Count nodes

        while (size >= k) {
            ListNode start = pre.next;
            pre.next = reverse(start, k); // \U0001f501 Reverse next k
            pre = start; // Move to the end of the reversed group
            size -= k;
        }

        return dummy.next; // \U0001f3af Return new head
    }

    public int len(ListNode head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count; // \U0001f522 Total node count
    }

    public ListNode reverse(ListNode head, int k) {
        ListNode prev = null, curr = head;
        while (k-- > 0 && curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        head.next = curr; // \U0001f517 Connect tail to remaining list
        return prev;      // \U0001f501 Return new head of reversed group
    }
}