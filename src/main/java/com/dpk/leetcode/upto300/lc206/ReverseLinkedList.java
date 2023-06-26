package com.dpk.leetcode.upto300.lc206;

import com.dpk.leetcode.dto.ListNode;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode previous = null;

        while (current != null) {
            ListNode nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }
        return previous;
    }

    public void testCase1() {
        ListNode head = new ListNode(1);
        ListNode current = head;
        for (int i=2; i<6; i++) {
            current.next = new ListNode(i);
            current = current.next;
        }

        ListNode reverseNode = reverseList(head);

    }

    public static void main(String[] args) {
        ReverseLinkedList rll = new ReverseLinkedList();
        rll.testCase1();
    }
}
