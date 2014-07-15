package com.programming.dev.math_functions.impl;

import java.util.Arrays;

import com.programming.dev.math_functions.util.HashMapNode;

/**
 * Description.
 * @author Your Name
 */
public class HashMapImpl<K, V> {
    private int size;
    private int DEFAULT_CAPACITY = 16;

    private HashMapNode<K, V>[] hashMapNode = new HashMapNode[DEFAULT_CAPACITY];

    public V get(final K key) {
        for (int i = 0; i < size; i++) {
            if (hashMapNode[i] != null) {
                if (hashMapNode[i].getValue().equals(key)) {
                    return hashMapNode[i].getValue();
                }
            }
        }
        return null;
    }

    public boolean put(final K key, final V value) {
        boolean insert = true;
        if (size == DEFAULT_CAPACITY) {
            DEFAULT_CAPACITY = DEFAULT_CAPACITY * 2;
            hashMapNode = Arrays.copyOf(hashMapNode, DEFAULT_CAPACITY);
        }
        for (int i = 0; i < size; i++) {
            if (hashMapNode[i] != null) {
                if (hashMapNode[i].getValue().equals(key)) {
                    insert = false;
                }
            }
        }

        if (insert == false) {
            hashMapNode[size++] = new HashMapNode<K, V>(key, value);
            return true;
        }
        return insert;
    }

    public int getSize() {
        return size;
    }
}
