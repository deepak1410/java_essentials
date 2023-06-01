package com.dpk.ds.stack.array;

import com.dpk.ds.dto.Employee;

public class StackClient {

    public static void stackOperation() {
        ArrayStack stack = new ArrayStack(10);

        System.out.println("Pushing 4 employees to stack");
        stack.push(new Employee("Jane", "Jone", 100));
        stack.push(new Employee("Tom", "Smith", 200));
        stack.push(new Employee("Matt", "Toe", 300));
        stack.push(new Employee("Tim", "Cook", 400));
        stack.display();

        System.out.println("Popping from Stack");
        stack.pop();

        System.out.println("Printing the current stack");
        stack.display();

        System.out.println("Peaking an item from stack -> " + stack.peak());

        System.out.println("Printing the current stack");
        stack.display();
    }

    public static void main(String[] args) {
        stackOperation();
    }
}
