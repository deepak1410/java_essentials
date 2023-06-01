package com.dpk.ds.linkedlist.singly;

import com.dpk.ds.dto.Employee;

public class EmployeeLinkedList {

    private EmployeeNode head;
    private int size;

    public int getSize() {
        return size;
    }

    public void addToFront(Employee employee) {
        EmployeeNode employeeNode = new EmployeeNode(employee);
        employeeNode.setNext(head);
        head = employeeNode;
        size++;
    }

    public void removeFromFront() {
        EmployeeNode removeNode = head;
        head = head.getNext();
        removeNode.setNext(null);
        size--;
    }

}
