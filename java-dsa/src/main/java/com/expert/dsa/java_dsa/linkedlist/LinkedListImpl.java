package com.expert.dsa.java_dsa.linkedlist;

import java.util.Objects;

public class LinkedListImpl {

    private Node head;
    private Node tail;
    private int length = 0;

    public LinkedListImpl(int value) {
        Node node = new Node(value);
        head = node;
        tail = node;
        length++;
    }

    public int getLength() {
        return length;
    }

    public void printLinkedList(){
        Node temp = head;
        while(Objects.nonNull(temp)) {
           System.out.println("Element is "+ temp.value);
           temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head is "+head.value);
    }
    public void getTail() {
        System.out.println("Tail is "+head.value);
    }

    public int length() {
        return length;
    }

    public void append(int value) {
        Node node = new Node(value);
        if(length == 0){
            this.head = node;
            this.tail = node;
            length++;
        } else {
            this.tail.next = node;
            this.tail = node;
            length++;
        }
    }

    public int removeLast(){
        if(length ==0) return -1;

        Node pre = head;
        Node temp = head;

        while(null != temp.next) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if(length ==0) {
            head = null;
            tail = null;
        }
        return temp.value;
    }

    public void prepend(int value){
        Node node = new Node(value);
        if(length ==0){
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }
        length++;
    }

    public int removeFirst(){
        if(length ==0)
            return -1;
        if(length == 1) {
            Node temp = head;
            head = null;
            tail = null;
            length--;
            return temp.value;
        }
        Node temp = head;
        head = temp.next;
        length--;
        return temp.value;
    }

    public int get(int i) {
        Node temp = head;
        int index = 0;
        if(length == 0 || i >= length)
            return -1;
        if(i == 0){
            return temp.value;
        } else {
            while (index < i){
                temp = temp.next;
                index++;
            }
            return temp.value;
        }
    }

    public boolean set(int i, int value) {
        if(length == 0 || i >= length)
            return false;

        Node temp = head;
        for(int index = 0; index < i; index++){
            temp = temp.next;
        }
        if(temp != null){
            temp.value = value;
            return true;
        } else
            return false;
    }

    public boolean insert(int index, int value) {
        if(index > length || index < 0)
            return false;
        Node newNode = new Node(value);
        Node temp = head;
        if(index ==0) {
            prepend(value);
            return true;
        }
        if(index == length) {
            append(value);
            return true;
        }
        for(int i=0; i< index-1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
}
