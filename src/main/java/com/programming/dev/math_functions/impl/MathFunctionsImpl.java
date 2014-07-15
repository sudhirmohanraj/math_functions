package com.programming.dev.math_functions.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.programming.dev.math_functions.factory.MathFunctions;
import com.programming.dev.math_functions.util.TreeNode;

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
    public TreeNode lowestCommonAncestor(final TreeNode root, final TreeNode right, final TreeNode left) {
        if (root == null) {
            return null;
        }
        return null;
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
}
