package com.expert.dsa.java_dsa.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListTest {

    @Test
    public void testAppend(){
        System.out.println("testing Append");
        LinkedListImpl linkedList = new LinkedListImpl(1);
        linkedList.append(2);
        Assertions.assertEquals(2, linkedList.length());
    }

    @Test
    public void testRemoveLast(){
        LinkedListImpl linkedList = new LinkedListImpl(1);
        linkedList.append(2);
        int removedElemnt = linkedList.removeLast();

        Assertions.assertEquals(2, removedElemnt);
        Assertions.assertEquals(1, linkedList.length());
    }

    @Test
    public void testRemoveFirst(){
        LinkedListImpl linkedList = new LinkedListImpl(1);
        linkedList.append(2);
        int removedElemnt = linkedList.removeFirst();

        Assertions.assertEquals(1, removedElemnt);
        Assertions.assertEquals(1, linkedList.length());
    }
}
