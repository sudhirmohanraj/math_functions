package com.programming.dev.math_functions.impl;

import com.programming.dev.math_functions.util.LinkedList;
import sun.awt.image.ImageWatched;

/**
 * Created by wyh669 on 1/10/17.
 */
public class LeastElementLinkedList {

    // Traverse through the linked list and have a variable as min and update it, at the end of the list the minimum will be found.
    // Sort the linked list and return the first element.
    // Can also use Collections.max or Collections.min
    // Took 15 min.
    
    public static void main(String[] args) {
        LinkedListNode node = new LinkedListNode();
        LinkedListNode node1 = new LinkedListNode();
        LinkedListNode node2 = new LinkedListNode();
        LinkedListNode node3 = new LinkedListNode();
        LinkedListNode node4 = new LinkedListNode();
        LinkedListNode node5 = new LinkedListNode();
        node5.setData(-100);
        node5.setNext(null);
        node4.setData(-10);
        node4.setNext(node5);
        node3.setData(-5);
        node3.setNext(node4);
        node2.setData(-1);
        node2.setNext(node3);
        node1.setData(-500);
        node1.setNext(node2);
        node.setData(2);

        node.setNext(node1);


        System.out.println(minElement(node));


    }

    public static int minElement(LinkedListNode node) {
        int minElement = 0;

        if(null == node && null!= Integer.valueOf(node.getData())) {
            throw new IllegalArgumentException();
        }

        minElement = Integer.valueOf(node.getData());
        node = node.getNext();
        while(null != node) {
            if(minElement > Integer.valueOf(node.getData())) {
                minElement = Integer.valueOf(node.getData());
            }
            node = node.getNext();
        }

    return minElement;
    }
}
