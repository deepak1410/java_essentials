package com.dpk.ds.stack.linkedlist;

import com.dpk.ds.dto.Employee;

public class StackClient {

    public static void stackOperation() {
        LinkedListStack stack = new LinkedListStack();

        System.out.println("Pushing 4 employees to stack");
        stack.push(new Employee("Jane", "Jones", 100));
        stack.push(new Employee("John", "Doe", 100));
        stack.push(new Employee("Mike", "Wilson", 100));
        stack.push(new Employee("Mary", "Smith", 100));

        stack.printStack();

        System.out.println("Peak from stack -> " + stack.peak());

        System.out.println("Pop from stack -> " + stack.pop());
        System.out.println("Pop from again -> " + stack.pop());

        System.out.println("Peak from stack -> " + stack.peak());
        stack.printStack();
    }

    public static void main(String[] args) {
        stackOperation();
    }
}
