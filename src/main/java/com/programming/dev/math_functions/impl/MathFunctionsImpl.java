package com.programming.dev.math_functions.impl;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

import com.programming.dev.math_functions.factory.MathFunctions;
import com.programming.dev.math_functions.util.TreeNode;
import com.programming.dev.math_functions.util.UtilityClass;

/**
 * Implementation for {@link MathFunctions}
 * @author mohanraj,sudhir
 */
public class MathFunctionsImpl implements MathFunctions {

    public int MiddleElementLinkedList(final com.programming.dev.math_functions.util.LinkedList linkedList) {
        final com.programming.dev.math_functions.util.LinkedList.Node head = linkedList.head();
        com.programming.dev.math_functions.util.LinkedList.Node current = head;
        com.programming.dev.math_functions.util.LinkedList.Node middle = head;

        int length = 0;
        while (current.next() != null) {
            length++;
            if (length % 2 == 0) {
                middle = middle.next();
            }
            current = current.next();
        }

        if (length % 2 == 0) {
            middle = middle.next();
        }

        return length;
    }

    public Long FindDuplicateInArray(final List<Integer> inputArray) {
        final Integer size = inputArray.size();
        final Long expectedSum = (long) (size * (size + 1));

        Long actualSum = 0L;
        for (final Integer each : inputArray) {
            actualSum = actualSum + each;
        }
        return expectedSum - actualSum;
    }

    public String reverseString(final String input) {
        if (input.length() < 2) {
            return input;
        }
        // String temp = input.substring(1);
        // char temp1 = input.charAt(0);
        return reverseString(input.substring(1) + input.charAt(0));
    }

    public List<String> removeDuplicateMaintainOrder(final List<String> inputArrayList) {
        if (inputArrayList.size() == 0) {
            return new ArrayList<String>();
        } else {
            final List<String> outputList = new ArrayList<String>();
            final Set<String> storageSet = new HashSet<String>();
            final boolean result;
            for (final String elements : inputArrayList) {
                if (storageSet.add(elements)) {
                    outputList.add(elements);
                }
            }
            return outputList;
        }
    }

    /**
     * {@inheritDoc}
     */
    public ArrayList<Integer> LargestContinuousSum(final ArrayList<Integer> input) {
        final ArrayList<Integer> outputArray = new ArrayList<Integer>();
        int sum = 0;
        int size = 0;
        int maxsum = 0;
        int i = 0;
        while (i < input.size()) {
            if (i == 0 || sum == 0) {
                sum += input.get(i);
                size = size + 1;
                outputArray.add(input.get(i));
                maxsum = sum;
                i++;
            } else if (input.get(i) > input.get(i - 1)) {
                size = size + 1;
                sum += input.get(i);
                if (sum > maxsum) {
                    maxsum = sum;
                    outputArray.add(input.get(i));
                    i++;
                } else {
                    outputArray.clear();
                    sum = input.get(i);
                    outputArray.add(input.get(i));
                    i = i - 1;
                }
            } else {
                sum = 0;
            }
        }
        return outputArray;
    }

    /**
     * {@inheritDoc}
     */
    public int BinarySearch(final ArrayList<Integer> sortedArray, final int elementToFind) {
        int first = 0;
        int last = sortedArray.size() - 1;
        int middle = (sortedArray.size()) / 2;

        while (first <= last) {
            if (sortedArray.get(middle) < elementToFind) {
                first = middle + 1;
            } else if (sortedArray.get(middle) == elementToFind) {
                System.out.println(elementToFind + " found at location " + (middle + 1) + ".");
                return 1;
            } else {
                last = middle - 1;
            }

            middle = (first + last) / 2;
        }
        if (first > last) {
            System.out.println(elementToFind + " is not present in the list.\n");
            return -1;
        }
        return 0;
    }

    /**
     * {@inheritDoc}
     */
    public ArrayList<Integer> bubbleSort(final ArrayList<Integer> inputArray) {
        final ArrayList<Integer> outputArray = new ArrayList<Integer>();
        int temp;
        for (int i = inputArray.size() - 1; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                if (inputArray.get(j - 1) > inputArray.get(j)) {
                    temp = inputArray.get(j - 1);
                    inputArray.set(j - 1, inputArray.get(j));
                    inputArray.set(j, temp);
                }
            }
        }
        return inputArray;
    }

    /**
     * {@inheritDoc}
     */
    public int[] selectionSort(final int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < input.length; j++) {
                if (input[j] < input[min]) {
                    min = j;
                }
                final int temp = input[i];
                input[i] = input[min];
                input[min] = temp;
            }
        }
        return input;
    }

    /**
     * {@inheritDoc}
     */
    public int lowestCommonAncestor(final TreeNode root, final TreeNode p, final TreeNode q) {

        /*
         * if (root == null) { return null; } if (root == p || root == q) { return root; } else { final TreeNode l =
         * lowestCommonAncestor(root.getLeft(), p, q); final TreeNode r = lowestCommonAncestor(root.getRight(), p, q);
         * if (l != null && r != null) { return root; } else if (l != null) { return l; } else { return r; } }
         */

        final Vector<Integer> v1 = new Vector<Integer>();
        final Vector<Integer> v2 = new Vector<Integer>();

        // if (findPath(root, v1, p) || findPath(root, v2, 1)) {
        // return -1;
        // }

        int i;
        for (i = 0; i < v1.size() && i < v2.size(); i++) {
            if (v1.get(i) != v2.get(i)) {
                break;
            }
        }
        return v1.get(i - 1);

    }

    /**
     * @param root
     * @param v2
     * @param i
     * @return
     */
    private boolean findPath(final TreeNode root, final Vector<Integer> path, final int i) {
        if (root == null) {
            return false;
        }
        // not in path from root to k
        path.add(root.getData());

        // See if the k is same as root's key
        if (root.getData() == i) {
            return true;
        }

        // Check if k is found in left or right sub-tree
        if ((root.getLeft() != null && findPath(root.getLeft(), path, i))
                || (root.getRight() != null && findPath(root.getRight(), path, i))) {
            return true;
        }

        // If not present in subtree rooted with root, remove root from
        // path[] and return false
        path.clear();
        return false;
    }

    /**
     * {@inheritDoc}
     */
    public Boolean intersectionOfArryays(final int[] inputArray1, final int[] inputArray2) {
        final HashSet<Integer> firstSet = new HashSet<Integer>();
        for (int i = 0; i < inputArray1.length; i++) {
            firstSet.add(inputArray1[i]); // O(N)
        }
        for (int i = 0; i < inputArray2.length; i++) {
            if (firstSet.contains(inputArray2[i])) {
                return true; // O(N)
            }
        }
        // O(2N) is the average worst case.
        return false;
    }

    /**
     * {@inheritDoc}
     */
    public String[] removedDuplicatesInorder(final String input) {
        final char[] chars = input.toCharArray();
        return null;
    }

    public ArrayList<Integer> levelOrderTraversal(final TreeNode treeNode) {
        if (treeNode == null) {
            return null;
        }
        final ArrayDeque<TreeNode> queue = new ArrayDeque<TreeNode>();
        TreeNode tempNode = new TreeNode();
        final ArrayList<Integer> outputList = new ArrayList<Integer>();

        queue.push(treeNode);
        while (!queue.isEmpty()) {
            tempNode = queue.pop();
            outputList.add(tempNode.getData());
            if (tempNode.getLeft() != null) {
                queue.push(tempNode.getLeft());
            } else if (tempNode.getRight() != null) {
                queue.push(tempNode.getRight());
            }
        }
        return outputList;
    }

    public ArrayList<Integer> levelOrderTraversalV2(final TreeNode treenode) {
        final Stack<TreeNode> stack1 = new Stack<TreeNode>();
        final Stack<TreeNode> stack2 = new Stack<TreeNode>();
        TreeNode tempNode = new TreeNode();
        final ArrayList<Integer> outputList = new ArrayList<Integer>();

        if (treenode == null) {
            return null;
        }
        stack1.push(treenode);

        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                tempNode = stack1.pop();
                outputList.add(tempNode.getData());
                stack2.push(tempNode.getRight());
                stack2.push(tempNode.getLeft());
            }
            while (!stack2.isEmpty()) {
                tempNode = stack2.pop();
                outputList.add(tempNode.getData());
                stack1.push(tempNode.getLeft());
                stack1.push(tempNode.getRight());
            }
        }

        return null;
    }

    /**
     * {@inheritDoc}
     */
    public String nextHighestNumber(final Integer input) {
        return null;
    }

    public ArrayList<Integer> printReverseLevelOrder(final TreeNode root) {
        if (root == null) {
            return null;
        }
        final ArrayList<TreeNode> storage = new ArrayList<TreeNode>();
        final ArrayList<Integer> reverseLevelOrderNodes = new ArrayList<Integer>();
        TreeNode tempNode = new TreeNode();
        storage.add(root);
        for (int i = 0; i < storage.size(); i++) {
            tempNode = storage.get(i);
            if (tempNode.getLeft() != null) {
                storage.add(tempNode.getLeft());
            }
            if (tempNode.getRight() != null) {
                storage.add(tempNode.getRight());
            }
        }

        for (int i = storage.size() - 1; i >= 0; i--) {
            reverseLevelOrderNodes.add(storage.get(i).getData());
        }
        return reverseLevelOrderNodes;
    }

    public Boolean equalityOfBSTNoStructureRelevance(final TreeNode root1, final TreeNode root2) {
        final ArrayDeque<TreeNode> queue = new ArrayDeque<TreeNode>();
        final ArrayDeque<TreeNode> traverseQueue = new ArrayDeque<TreeNode>();
        final HashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
        TreeNode temp = new TreeNode();
        if (root1 == null && root2 == null) {
            return true;
        }
        queue.push(root1);
        while (!queue.isEmpty()) {
            temp = queue.pop();
            map.put(temp.getData(), temp.getData());
            if (temp.getLeft() != null) {
                queue.push(root1.getLeft());
            }
            if (temp.getRight() != null) {
                queue.push(temp.getRight());
            }
        }
        traverseQueue.add(root2);
        while (!traverseQueue.isEmpty()) {
            temp = traverseQueue.pop();
            if (map.containsKey(temp.getData()) != true) {
                return false;
            }
            if (temp.getLeft() != null) {
                traverseQueue.push(temp);
            }
            if (temp.getRight() != null) {
                traverseQueue.push(temp);
            }

        }
        return true;
    }

    /**
     * {@inheritDoc}
     */
    public void treetoDoublyLinkedList(final TreeNode root, final TreeNode lastNode, TreeNode head) {
        if (root == null) {
            return;
        }

        if (root.getLeft() == null) {
            treetoDoublyLinkedList(root.getLeft(), lastNode, head);
        }

        if (lastNode != null) {
            lastNode.setRight(root);
        } else {
            head = root;
        }

        root.setLeft(lastNode);

        if (root.getRight() != null) {
            treetoDoublyLinkedList(root.getRight(), lastNode, head);
        }
    }

    public void powerSet(final String inputString) {
        final char[] inputCharArray = inputString.toCharArray();

        final int len = inputCharArray.length;
        final double powerSetsLength = Math.pow(2, len);
        int count = 0;

        final char[] outputCharArray = new char[(int) powerSetsLength];
        while (count < powerSetsLength) {
            final String binary = UtilityClass.intToBinary(count, len);
            for (int j = 0; j < binary.length(); j++) {
                if (binary.charAt(j) == '1') {
                    System.out.println(inputCharArray[j]);
                }
            }
            count++;
        }
    }

    /**
     * {@inheritDoc}
     */
    public void printAllPaths(final int[][] array, final int currX, final int currY, String path) {
        final int rowCount = array.length;
        final int colCount = array[0].length;

        if (currX == rowCount - 1) {
            for (int j = currY; j <= colCount - 1; j++) {
                path = path + array[currX][j];
            }
            System.out.println("Path : " + path);
            return;
        }

        if (currY == colCount - 1) {
            for (int i = currX; i <= rowCount - 1; i++) {
                path = path + array[i][currY];
            }
            System.out.println("Path : " + path);
            return;
        }
        path = path + array[currX][currY];
        printAllPaths(array, currX + 1, currY, path);
        printAllPaths(array, currX, currY + 1, path);

    }
}
