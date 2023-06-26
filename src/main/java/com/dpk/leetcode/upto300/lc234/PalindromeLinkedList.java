package com.dpk.leetcode.upto300.lc234;

import com.dpk.leetcode.dto.ListNode;

public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while(head != null) {
            sb.append(head.val);
            head = head.next;
        }

        return sb.toString().equals(sb.reverse().toString());
    }
}
