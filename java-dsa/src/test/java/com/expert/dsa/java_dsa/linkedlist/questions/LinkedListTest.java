package com.expert.dsa.java_dsa.linkedlist.questions;

import com.expert.dsa.java_dsa.linkedlist.LinkedListImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListTest {

    @Test
    public void testFindMiddleNumberEven(){

        LinkedList linkedList = new LinkedList(1);

        Assertions.assertEquals(1, linkedList.findMiddleNode().value);

        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);

        linkedList.printList();

        LinkedList.Node node = linkedList.findMiddleNode();

        Assertions.assertEquals(3, node.value);

        linkedList.append(6);

        LinkedList.Node nodeEven = linkedList.findMiddleNode();

        Assertions.assertEquals(4, nodeEven.value);

        linkedList.makeEmpty();

        Assertions.assertEquals(null, linkedList.findMiddleNode());
    }

    @Test
    public void testFindKThElement(){

        LinkedList linkedList = new LinkedList(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);
        linkedList.printAll();
        LinkedList.Node node = linkedList.findKthFromEnd(2);
        Assertions.assertEquals(4, node.value);
        Assertions.assertEquals(null,linkedList.findKthFromEnd(6));
        Assertions.assertEquals(1, linkedList.findKthFromEnd(5).value);

    }
}
