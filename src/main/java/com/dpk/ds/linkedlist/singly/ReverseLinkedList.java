package com.dpk.ds.linkedlist.singly;

import com.dpk.ds.dto.Employee;

public class ReverseLinkedList {

    EmployeeNode head = null;
    int size = 0;

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }

    public void constructLinkedList() {
        Employee jan = new Employee("Jan", "Jones", 10);
        Employee john = new Employee("John", "Doe", 20);
        Employee mike = new Employee("Mike", "Wilson", 30);
        Employee mary = new Employee("Mary", "Smith", 40);

        addToFront(jan);
        addToFront(john);
        addToFront(mike);
        addToFront(mary);
    }

    public EmployeeNode reverse(EmployeeNode node) {

        EmployeeNode current = node;
        EmployeeNode previous = null;

        while(current != null) {
            EmployeeNode nextNode = current.getNext();
            current.setNext(previous);
            previous = current;
            current = nextNode;
        }

        return previous;
    }

    public void display(EmployeeNode node) {
        System.out.println("Displaying linkedList items");

        while (node != null) {
            System.out.println(node.getEmployee());
            node = node.getNext();
        }
    }

    public static void main(String[] args) {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        reverseLinkedList.constructLinkedList();

        reverseLinkedList.display(reverseLinkedList.head);

        EmployeeNode reversedList = reverseLinkedList.reverse(reverseLinkedList.head);
        reverseLinkedList.display(reversedList);

    }
}
