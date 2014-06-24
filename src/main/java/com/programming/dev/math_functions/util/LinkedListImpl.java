package com.programming.dev.math_functions.util;

/**
 * Description.
 * @author Your Name
 */
public class LinkedListImpl {

    Node head;
    Node tail;
    int size;

    private LinkedListImpl() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    private LinkedListImpl(final Node head, final Node tail, final int size) {
        this.head = head;
        this.tail = tail;
        this.size = size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }

    public void insertElementAtHead(final String value) {
        final Node newNode = new Node(value, null, null);
        if (head == null) {
            newNode.setLinkNext(newNode);
            newNode.setLinkPrevious(newNode);
            head = newNode;
            tail = newNode;
        } else {
            newNode.setLinkPrevious(tail);
            tail.setLinkNext(newNode);
            head.setLinkPrevious(newNode);
            newNode.setLinkNext(head);
            size++;
        }
    }

    public void insertElementAtTail(final String value) {
        final Node newNode = new Node(value, null, null);
        if (head == null) {
            newNode.setLinkNext(newNode);
            newNode.setLinkPrevious(newNode);
            head = newNode;
            tail = newNode;
        } else {
            newNode.setLinkPrevious(tail);
            tail.setLinkNext(newNode);
            head.setLinkPrevious(newNode);
            newNode.setLinkNext(head);
            tail = newNode;
        }
        size++;
    }

    public void deleteElementAtHead(final Node n) {
        if (size == 0) {
            throw new RuntimeException();
        } else if (size == 1) {
            head = null;
            tail = null;
            size = 0;
            return;
        } else if (tail.data.equals(n.data)) {
            final Node temp = n.getLinkPrevious();
            tail.setLinkPrevious(temp.getLinkPrevious());
            temp.setLinkNext(head);
            tail = temp;
            size--;
        } else if (head.data.equals(n.data)) {

        } else {
            for (int i = 0; i < size; i++) {
            }
        }
    }

    public void deleteElementAtPos(final String value) {

    }

}
