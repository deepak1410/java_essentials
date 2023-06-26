package com.dpk.leetcode.upto100.lc21;


public class MergeSortedLinkedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergeList = new ListNode(0);
        ListNode result = mergeList;

        while (list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                mergeList.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                mergeList.next = new ListNode(list2.val);
                list2 = list2.next;
            }

            mergeList = mergeList.next;
        }

        if(list1 != null) {
            mergeList.next = list1;
        } else {
            mergeList.next = list2;
        }

        return result.next;

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
