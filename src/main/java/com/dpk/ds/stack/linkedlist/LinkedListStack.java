package com.dpk.ds.stack.linkedlist;

import com.dpk.ds.dto.Employee;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListStack {
    private LinkedList<Employee> stack;

    public LinkedListStack() {
        stack = new LinkedList<>();
    }

    public void push(Employee employee) {
        stack.push(employee);
    }

    public Employee pop() {
        return stack.pop();
    }

    public Employee peak() {
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void printStack() {
        System.out.println("Printing stack");
        Iterator iterator = stack.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
