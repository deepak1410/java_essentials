package com.dpk.leetcode.upto100.lc19;

public class LinkedListRemoveItem {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode listNode = head;

        // Get the length of the LinkedList
        while (listNode != null) {
            length++;
            listNode = listNode.next;
        }

        int removeIndex = length - n;
        if(removeIndex == 0) {
            head = head.next;
            return head;
        }

        // Traverse till length-n item for removal
        ListNode previous = head;
        for(int i=0; i< removeIndex - 1; i++) {
            previous = previous.next;
        }

        previous.next = previous.next.next;

        return head;
    }

    public static void main(String[] args) {

    }

    class ListNode {
        private int val;
        private ListNode next;
        ListNode(int val) {
            this.val=val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }

}


