package com.dpk.ds.stack.array;

import com.dpk.ds.dto.Employee;

import java.util.EmptyStackException;

public class ArrayStack {
    private Employee[] stack;
    private int top;

    public ArrayStack(int capacity) {
        stack = new Employee[capacity];
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public void push(Employee employee) {
        if(top == stack.length) {
            Employee[] newArr = new Employee[2 * stack.length];
            System.arraycopy(stack, 0, newArr, 0, stack.length);
            stack = newArr;
        }

        stack[top++] = employee;
    }

    public Employee pop() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }

        return stack[--top];
    }

    public Employee peak() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }

        return stack[top - 1];
    }

    public void display() {
        for(int i = top -1; i>=0; i--) {
            System.out.println(stack[i]);
        }
    }

}
