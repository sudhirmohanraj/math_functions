package com.programming.dev.math_functions.impl;

import java.util.HashMap;

import com.programming.dev.math_functions.util.DoubleLinkedListNode;

public class LRUImpl {
    private final HashMap<Integer, DoubleLinkedListNode> map = new HashMap<Integer, DoubleLinkedListNode>();
    private DoubleLinkedListNode head;
    private DoubleLinkedListNode node;

    private final int len;
    private final int capacity;

    public LRUImpl(final int capacity) {
        this.capacity = capacity;
        len = 0;
    }

    public void set(final int key, final int value) {
        if (map.containsKey(key)) {

        }
    }

    public void removeNode(final DoubleLinkedListNode node) {
        final DoubleLinkedListNode cur = node;
        final DoubleLinkedListNode pre = cur.pre;
        final DoubleLinkedListNode next = cur.next;

    }
}