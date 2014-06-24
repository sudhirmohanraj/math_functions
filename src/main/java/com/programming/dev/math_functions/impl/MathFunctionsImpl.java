package com.programming.dev.math_functions.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.programming.dev.math_functions.factory.MathFunctions;

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
    public int LargestContinuousSum(final ArrayList<Integer> input) {
        final HashMap<Integer, Integer> maintainer = new HashMap<Integer, Integer>();
        int sum = 0;
        int size = 0;
        int maxsum = 0;
        int i = 0;
        while (i < input.size()) {
            if (i == 0 || sum == 0) {
                sum += input.get(i);
                size = size + 1;
                maintainer.put(1, sum);
                maxsum = sum;
                i++;
            } else if (input.get(i) > input.get(i - 1)) {
                size = size + 1;
                sum += input.get(i);
                if (sum > maxsum) {
                    maxsum = sum;
                    i++;
                } else {
                    sum = input.get(i);
                    i = i - 1;
                }
            } else {
                sum = 0;
            }
        }
        return maxsum;
    }
}
