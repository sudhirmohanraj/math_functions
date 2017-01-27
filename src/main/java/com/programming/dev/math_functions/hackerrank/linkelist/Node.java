package com.programming.dev.math_functions.hackerrank.linkelist;

import java.util.Stack;

/**
 * Created by wyh669 on 1/19/17.
 */
public class Node {

    int data;
    Node next;

    public static void main(String[] args) {
        Node node = new Node();
        node.data =1;
        Node node1 = new Node();
        node1.data =3;
        Node node2 = new Node();
        node2.data =5;
        Node node3 = new Node();
        node3.data =6;
        node.next=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=null;

        System.out.println(GetNode(node, 2));

    }

    public static int GetNode(Node node,int n) {
        // This is a "method-only" submission.
        // You only need to complete this method.
        Stack<Integer> nodes = new Stack<Integer>();
        while(node!=null){
            nodes.push(node.data);
            node = node.next;
        }
        int i =0;
        while(i <= n-1) {
            nodes.pop();
            i++;
        }

        return nodes.pop();

    }
}
