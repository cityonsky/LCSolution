package p2;

/**
 * Created by sky on 2016/11/22 0022.
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */


public class Solution {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode p = head;
        ListNode it1 = l1;
        ListNode it2 = l2;
        int value = 0;
        while (it1 != null || it2 != null || value != 0) {
            if (it1 != null) {
                value += it1.val;
                it1 = it1.next;
            }
            if (it2 != null) {
                value += it2.val;
                it2 = it2.next;
            }
            p.next = new ListNode(value % 10);
            value /= 10;
            p = p.next;
        }
        return head.next;
    }
}
