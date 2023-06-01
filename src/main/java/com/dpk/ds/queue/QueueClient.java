package com.dpk.ds.queue;

import com.dpk.ds.dto.Employee;

public class QueueClient {

    public static void queueOperations() {
        LinkedListQueue queue = new LinkedListQueue();

        System.out.println("Pushing 4 employees to queue");
        queue.push(new Employee("Jane", "Jone", 100));
        queue.push(new Employee("Tom", "Smith", 200));
        queue.push(new Employee("Matt", "Toe", 300));
        queue.push(new Employee("Tim", "Cook", 400));
        queue.printQueue();

        System.out.println("Popping from queue");
        Employee employee = queue.pop();
        System.out.println(employee);

        System.out.println("Printing the current queue");
        queue.printQueue();

        System.out.println("Peaking an item from queue -> " + queue.peak());

        System.out.println("Printing the current queue");
        queue.printQueue();
    }

    public static void main(String[] args) {
        queueOperations();
    }
}
