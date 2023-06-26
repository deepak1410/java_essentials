package com.dpk.leetcode.upto200.lc148;

import com.dpk.leetcode.dto.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {

    public ListNode sortList(ListNode head) {

        List<Integer> list = new ArrayList<>();
        ListNode node = head;
        while (node != null) {
            list.add(node.val);
            node = node.next;
        }

        Collections.sort(list);
        ListNode sortedListNode = new ListNode();
        ListNode currentNode = sortedListNode;
        for(Integer data : list) {
            currentNode.next = new ListNode(data);
            currentNode = currentNode.next;
        }
        return sortedListNode.next;
    }
}
