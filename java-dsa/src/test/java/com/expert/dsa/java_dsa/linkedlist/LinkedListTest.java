package com.expert.dsa.java_dsa.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

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

    @Test
    public void getElementByIndex(){
        LinkedListImpl linkedList = new LinkedListImpl(1);

        Assertions.assertEquals(-1, linkedList.get(5));

        Assertions.assertEquals(1, linkedList.length());
        Assertions.assertEquals(1, linkedList.get(0));
        linkedList.append(2);
        linkedList.append(3);
        Assertions.assertEquals(3, linkedList.length());
        Assertions.assertEquals(2, linkedList.get(1));
        Assertions.assertEquals(3, linkedList.get(2));

        linkedList.removeFirst();
        linkedList.removeFirst();
        linkedList.removeFirst();
        Assertions.assertEquals(-1, linkedList.get(0));

    }

    @Test
    public void testSetElement(){
        LinkedListImpl linkedList = new LinkedListImpl(1);
        linkedList.append(2);
        Assertions.assertEquals(2, linkedList.length());
        linkedList.set(1, 100);
        Assertions.assertEquals(100, linkedList.get(1));
        linkedList.removeFirst();
        Assertions.assertEquals(100, linkedList.get(0));
        linkedList.set(0, 200);
        Assertions.assertEquals(200, linkedList.get(0));
    }


    @Test
    public void insertElement(){
        LinkedListImpl linkedList = new LinkedListImpl(1);
        linkedList.insert(1,2);
        linkedList.append(3);

        linkedList.printLinkedList();
        linkedList.insert(2, 100);

        Assertions.assertEquals(100, linkedList.get(2));

        linkedList.printLinkedList();
    }

    @Test
    public void testRemove(){
        LinkedListImpl linkedList = new LinkedListImpl(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.printLinkedList();

        Assertions.assertEquals(null, linkedList.remove(-1));
        Assertions.assertNull(linkedList.remove(100));

        Assertions.assertEquals(1, linkedList.remove(0).value);
        Assertions.assertEquals(3, linkedList.length());

        linkedList.printLinkedList();

        linkedList.prepend(1);

        Assertions.assertEquals(4, linkedList.remove(3).value);

        linkedList.append(4);

        linkedList.printLinkedList();

        Assertions.assertEquals(3, linkedList.remove(2).value);
        Assertions.assertEquals(4, linkedList.remove(2).value);
        linkedList.printLinkedList();
        Assertions.assertEquals(1, linkedList.remove(0).value);
        Assertions.assertEquals(2, linkedList.remove(0).value);
    }

    @Test
    public void testReverse(){
        LinkedListImpl linkedList = new LinkedListImpl(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);

        linkedList.printLinkedList();

        linkedList.reverse();

        linkedList.printLinkedList();

        Assertions.assertEquals(4, linkedList.get(0));
        Assertions.assertEquals(1, linkedList.get(3));

    }
}
