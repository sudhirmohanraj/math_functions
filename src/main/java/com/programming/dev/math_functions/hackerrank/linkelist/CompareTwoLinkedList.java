package com.programming.dev.math_functions.hackerrank.linkelist;


import java.util.Stack;

/**
 * Created by wyh669 on 2/6/17.
 */
public class CompareTwoLinkedList {

    public static void main(String[] args) {
        Node node = new Node();
        node.data = 1;
        Node node1 = new Node();
        node1.data = 3;
        Node node2 = new Node();
        node2.data = 5;
        Node node3 = new Node();
        node3.data = 6;
        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = null;
        compare(node1, node2);
    }

    public static int compare(Node node1, Node node2) {

        Stack<Integer> nodeSt1 = new Stack<Integer>();
        Stack<Integer> nodeSt2 = new Stack<Integer>();

        while (node1 != null) {
            nodeSt1.push(node1.data);
            node1 = node1.next;
        }


        while (node2 != null) {
            nodeSt2.push(node2.data);
            node2 = node2.next;
        }

        if (nodeSt1.size() == nodeSt2.size()) {
            while (nodeSt1.size() > 0) {
                if (nodeSt1.pop().equals(nodeSt2.pop())) {
                    return 0;
                }
            }
        } else {
            return 0;
        }

        return 1;
    }
}