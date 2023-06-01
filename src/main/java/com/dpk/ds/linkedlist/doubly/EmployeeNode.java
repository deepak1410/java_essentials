package com.dpk.ds.linkedlist.doubly;

import com.dpk.ds.dto.Employee;

public class EmployeeNode {
    private EmployeeNode previous;
    private EmployeeNode next;
    private Employee employee;

    public EmployeeNode(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getPrevious() {
        return previous;
    }

    public void setPrevious(EmployeeNode previous) {
        this.previous = previous;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
