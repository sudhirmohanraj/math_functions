package com.programming.dev.math_functions.impl;

import java.util.ArrayDeque;
import java.util.NoSuchElementException;

import com.programming.dev.math_functions.util.PreOrderBinarayTreeIterator;
import com.programming.dev.math_functions.util.TreeNode;

/**
 * Description.
 * @author Your Name
 */
public class PreOrderBinaryTreeIteratorImpl implements PreOrderBinarayTreeIterator {

    ArrayDeque<TreeNode> deque = new ArrayDeque<TreeNode>();

    public PreOrderBinaryTreeIteratorImpl(final TreeNode treeNode) {
        if (treeNode != null) {
            deque.push(treeNode);
        }
    }

    /**
     * {@inheritDoc}
     */
    public boolean hasNext() {
        return !deque.isEmpty();
    }

    /**
     * {@inheritDoc}
     */
    public Integer next() {
        // TODO Auto-generated method stub

        if (!hasNext()) {
            throw new NoSuchElementException("All nodes have been visited");
        }

        final TreeNode result = deque.pop();
        if (result.getRight() != null) {
            deque.push(result.getRight());
        }
        if (result.getLeft() != null) {
            deque.push(result.getLeft());
        }

        return result.getData();
    }

    /**
     * {@inheritDoc}
     */
    public void remove() {
        throw new UnsupportedOperationException("remove operation is not supported.");
    }

}
