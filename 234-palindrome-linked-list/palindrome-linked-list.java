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
    public boolean isPalindrome(ListNode head) {

        // Create a copy of the linked list
        ListNode head1 = null;
        ListNode temp1 = null;
        ListNode temp = head;

        while (temp != null) {
            ListNode newnode = new ListNode(temp.val);

            if (head1 == null) {
                head1 = newnode;
                temp1 = newnode;
            } else {
                temp1.next = newnode;
                temp1 = newnode;
            }

            temp = temp.next;
        }

        // Reverse the copied list
        ListNode prev = null;
        ListNode curr = head1;
        ListNode next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head1 = prev;

        // Compare original list with reversed list
        temp = head;
        temp1 = head1;

        while (temp != null) {
            if (temp.val != temp1.val) {
                return false;
            }

            temp = temp.next;
            temp1 = temp1.next;
        }

        return true;
    }
}