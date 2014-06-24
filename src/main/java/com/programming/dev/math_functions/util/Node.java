package com.programming.dev.math_functions.util;

/**
 * Circular Linked List Implementation
 * @author mohanraj,sudhir
 */
class Node {
    protected String data;
    protected Node next, prev;

    Node(final String d, final Node n, final Node p) {
        this.data = d;
        this.next = n;
        this.prev = p;
    }

    private Node() {
        data = null;
        next = null;
        prev = null;
    }

    public void setLinkNext(final Node n) {
        next = n;
    }

    public void setLinkPrevious(final Node p) {
        prev = p;
    }

    public void setLinkData(final String d) {
        data = d;
    }

    public Node getLinkPrevious() {
        return prev;
    }

    public Node getLinkNext() {
        return next;
    }

    public String getData() {
        return data;
    }
}
