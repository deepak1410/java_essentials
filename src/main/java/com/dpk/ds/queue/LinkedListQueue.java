package com.dpk.ds.queue;

import com.dpk.ds.dto.Employee;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListQueue {
    private LinkedList<Employee> queue = new LinkedList<>();

    public Employee peak() {
        return queue.getFirst();
    }

    public void push(Employee employee) {
        queue.addLast(employee);
    }

    public Employee pop() {
        return queue.removeFirst();
    }

    public void printQueue() {
        System.out.println("Displaying queue");
        Iterator<Employee> iterator = queue.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
