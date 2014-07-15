package com.programming.dev.math_functions.impl;

import java.util.NoSuchElementException;
import java.util.Stack;

import com.programming.dev.math_functions.util.InOrderBinaryTreeIterator;
import com.programming.dev.math_functions.util.TreeNode;

/**
 * Description.
 * @author Your Name
 */
public class InOrderBinaryTreeIteratorImpl implements InOrderBinaryTreeIterator {

    Stack<TreeNode> stack = new Stack<TreeNode>();

    public void pushLeftChildren(TreeNode cur) {
        while (cur != null) {
            stack.push(cur);
            cur = cur.getLeft();
        }
    }

    public InOrderBinaryTreeIteratorImpl(final TreeNode root) {
        pushLeftChildren(root);
    }

    /**
     * {@inheritDoc}
     */
    public void remove() {
        throw new UnsupportedOperationException("remove operation is not supported");
    }

    /**
     * {@inheritDoc}
     */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /**
     * {@inheritDoc}
     */
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException("All the elements have been traversed.");
        }

        final TreeNode result = stack.pop();
        pushLeftChildren(result.getRight());
        return result.getData();
    }

}
