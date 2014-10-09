package com.programming.dev.math_functions.util;

/**
 * Description.
 * @author Your Name
 */
public class DoubleLinkedListNode {
    public int val;
    public int key;
    public DoubleLinkedListNode pre;
    public DoubleLinkedListNode next;

    public DoubleLinkedListNode(final int key, final int value) {
        val = value;
        this.key = key;
    }

}
