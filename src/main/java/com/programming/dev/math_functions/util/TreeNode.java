package com.programming.dev.math_functions.util;

/**
 * Description.
 * @author Your Name
 */
public class TreeNode {

    TreeNode right;
    TreeNode left;
    int data;

    public TreeNode(final int data) {
        this.data = data;
    }

    public TreeNode() {
        right = null;
        left = null;
        data = 0;
    }

    public TreeNode getRight() {
        return right;
    }

    public TreeNode getLeft() {
        return left;
    }

    public int getData() {
        return data;
    }

    public void setRight(final TreeNode right) {
        this.right = right;
    }

    public void setLeft(final TreeNode left) {
        this.left = left;
    }

    public void setData(final int data) {
        this.data = data;
    }

    public TreeNode(final int d, final TreeNode r, final TreeNode l) {
        this.right = r;
        this.left = l;
        this.data = d;
    }
}
