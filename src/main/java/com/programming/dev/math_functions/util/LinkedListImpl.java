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

    // Floyd’s Cycle-Finding Algorithm,
    public boolean isCyclic() {
        Node fast = head;
        Node slow = head;

        while (slow != null && fast != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }

        return false;
    }

    public void deleteElementAtPos(final Node n) {
        if (size == 0) {
            throw new RuntimeException();
            // or log an error so that the downstream consumers know that this happened and we dont support this.
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
            final Node temp = n.getLinkNext();
            tail.setLinkNext(tail);
            head.setLinkNext(tail);
            size--;
        } else {
            final Node currentNode = head.getLinkNext();
            for (int i = 2; i < size; i++) {
                if (currentNode.getData().equals(n.getData())) {
                    final Node previous = currentNode.getLinkNext();
                    final Node next = currentNode.getLinkPrevious();
                    previous.setLinkNext(next);
                    next.setLinkPrevious(previous);
                    size--;
                }
            }
        }
    }
}
