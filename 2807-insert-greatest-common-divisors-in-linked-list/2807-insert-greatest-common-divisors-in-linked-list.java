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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode current = head;
        while (current != null && current.next != null) {
            ListNode first = current;
            ListNode second = current.next;
            int gcd = greatestCommonDivisors(first.val, second.val);

            ListNode newnode = new ListNode(gcd);

            newnode.next = second;
            first.next = newnode;

            current = second;
        }

        return head;
    }

    private int greatestCommonDivisors(int f, int s) {
        while (s != 0) {
            int temp = s;
            s = f % s;
            f = temp;
        }
        return f;
    }
}