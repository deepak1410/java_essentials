package com.dpk.leetcode.upto100.lc2;

import java.math.BigInteger;

/**
 * Problem statement https://leetcode.com/problems/add-two-numbers/
 */
public class SumTwoNumbers {

    /**
     * 1st approach
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger num1 = getNumber(l1);
        BigInteger num2 = getNumber(l2);
        BigInteger sum = num1.add(num2);

        ListNode listNode = getNode(sum);
        return listNode;
    }

    public BigInteger getNumber(ListNode node) {
        StringBuilder sb = new StringBuilder();

        while (node != null) {
            sb.append(node.val);
            node = node.next;
        }

        return new BigInteger(sb.reverse().toString());
    }

    public ListNode getNode(BigInteger number) {
        String num = "" + number;
        ListNode node = null;

        for(int i=0; i< num.length(); i++) {
            int num1 = Integer.parseInt(num.substring(i, i+1));
            ListNode current = new ListNode(num1);
            if(node == null) {
                node = current;
            } else {
                node = addToFront(node, num1);
            }
        }

        return node;
    }

    public ListNode addToFront(ListNode node, int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = node;
        return newNode;
    }

    /**
     * 2nd approach
     */
    public ListNode addTwoNumbersSol2(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0) {
            int x = l1 != null ? l1.val : 0;
            int y = l2 != null ? l2.val : 0;
            int sum = x + y + carry;

            int value = sum % 10;
            carry = sum /10;

            current.next = new ListNode(value);
            current = current.next;

            if(l1 != null) {
                l1 = l1.next;
            }

            if(l2 != null) {
                l2 = l2.next;
            }
        }

        return dummyHead.next;
    }

    public static void main(String[] args) {
        SumTwoNumbers sumTwoNumbers = new SumTwoNumbers();
        ListNode node1 = sumTwoNumbers.getNode(new BigInteger("942"));
        ListNode node2 = sumTwoNumbers.getNode(new BigInteger("9465"));

        ListNode sumNode = sumTwoNumbers.addTwoNumbers(node1, node2);
        System.out.println(sumNode);

        ListNode sumNode2 = sumTwoNumbers.addTwoNumbersSol2(node1, node2);
        System.out.println(sumNode2);
    }

}


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
