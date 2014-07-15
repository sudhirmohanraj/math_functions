package com.programming.dev.math_functions.util;

/**
 * Description.
 * @author Your Name
 */
public class HashMapNode<K, V> {

    public K key;
    public V value;

    public HashMapNode(final K key, final V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(final V value) {
        this.value = value;
    }

    public void setKey(final K key) {
        this.key = key;
    }

}
