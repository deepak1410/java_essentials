package com.dpk.leetcode.lc23;

import com.dpk.leetcode.dto.ListNode;
import com.dpk.leetcode.upto100.lc23.MergeKSortedLists;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MergeKSortedListsTest {

    private static MergeKSortedLists mergeKSortedLists;

    @BeforeAll
    static void setUp() {
        mergeKSortedLists = new MergeKSortedLists();
    }

    @Test
    void mergeKListsUsingPriorityQueue() {
        // [[1,4,5],[1,3,4],[2,6]]
        ListNode node1 = getListNode(new int[]{1, 4, 5});
        ListNode node2 = getListNode(new int[]{1, 3, 4});
        ListNode node3 = getListNode(new int[]{2, 6});

        ListNode[] lists = new ListNode[] {node1, node2, node3};
        ListNode outputNode = mergeKSortedLists.mergeKLists(lists);
    }

    @Test
    void mergeKListsUsingRecursion() {
        // [[1,4,5],[1,3,4],[2,6]]
        ListNode node1 = getListNode(new int[]{1, 4, 5});
        ListNode node2 = getListNode(new int[]{1, 3, 4});
        ListNode node3 = getListNode(new int[]{2, 6});

        ListNode[] lists = new ListNode[] {node1, node2, node3};
        ListNode outputNode = mergeKSortedLists.mergeKLists_2(lists);
    }

    private ListNode getListNode(int[] arr) {
        ListNode listNode = new ListNode(0);
        ListNode current = listNode;
        for(int item : arr) {
            current.next = new ListNode(item);
            current = current.next;
        }
        return listNode.next;
    }
}