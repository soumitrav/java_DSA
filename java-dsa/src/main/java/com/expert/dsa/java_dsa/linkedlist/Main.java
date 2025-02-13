package com.expert.dsa.java_dsa.linkedlist;

public class Main {

    public static void main(String []args) {
        System.out.println("Creating Linked List");
        LinkedListImpl linkedList = new LinkedListImpl(1);
        System.out.println("Linked List created with length "+ linkedList.getLength());
        linkedList.getHead();
        linkedList.getTail();
        linkedList.length();
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.printLinkedList();
        linkedList.length();
        int removedValue = linkedList.removeLast();
        System.out.println("Removed from linked list "+removedValue);
        linkedList.printLinkedList();
        linkedList.length();

        linkedList.prepend(4);
        linkedList.printLinkedList();

        linkedList.removeFirst();
        linkedList.removeFirst();
        System.out.println("After removing elements");

        linkedList.printLinkedList();
    }
}
