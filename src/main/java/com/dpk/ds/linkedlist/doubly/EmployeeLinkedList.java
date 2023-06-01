package com.dpk.ds.linkedlist.doubly;

import com.dpk.ds.dto.Employee;

public class EmployeeLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public int getSize() {
        return size;
    }

    public void addToFront(Employee employee) {

        EmployeeNode newHead= new EmployeeNode(employee);
        newHead.setNext(head);
        head.setPrevious(newHead);
        head = newHead;
        size++;
    }

}
