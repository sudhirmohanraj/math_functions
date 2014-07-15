package com.programming.dev.math_functions.impl;

import java.util.NoSuchElementException;
import java.util.Stack;

import com.programming.dev.math_functions.util.PostOrderBinaryTreeIterator;
import com.programming.dev.math_functions.util.TreeNode;

/**
 * Description.
 * @author Your Name
 */
public class PostOrderTreeBinaryTreeIteratorImpl implements PostOrderBinaryTreeIterator {

    Stack<TreeNode> stack = new Stack<TreeNode>();

    public PostOrderTreeBinaryTreeIteratorImpl(final TreeNode tn) {
        findNextLeaf(tn);
    }

    /**
     * @param tn
     */
    private void findNextLeaf(TreeNode tn) {
        while (tn != null) {
            stack.push(tn);
        }
        if (tn.getLeft() != null) {
            tn = tn.getLeft();
        } else if (tn.getRight() != null) {
            tn = tn.getRight();
        }
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
            throw new NoSuchElementException();
        }

        final TreeNode result = stack.pop();
        if (!stack.isEmpty()) {
            final TreeNode top = stack.peek();
            if (result == top.getLeft()) {
                findNextLeaf(top.getRight());
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public void remove() {
        // TODO Auto-generated method stub

    }

}
