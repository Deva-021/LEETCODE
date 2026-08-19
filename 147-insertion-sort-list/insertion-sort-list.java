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
    public ListNode insertionSortList(ListNode head) {

        // Count nodes
        int n = 0;
        ListNode temp = head;

        while (temp != null) {
            n++;
            temp = temp.next;
        }

        // Convert linked list to array
        int[] arr = new int[n];

        temp = head;

        for (int i = 0; i < n; i++) {
            arr[i] = temp.val;
            temp = temp.next;
        }

        // Insertion Sort
        for (int i = 1; i < n; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        // Copy sorted array back to linked list
        temp = head;

        for (int i = 0; i < n; i++) {
            temp.val = arr[i];
            temp = temp.next;
        }

        return head;
    }
}