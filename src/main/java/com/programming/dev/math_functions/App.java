package com.programming.dev.math_functions;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.programming.dev.math_functions.impl.MathFunctionsImpl;

/**
 * Hello world!
 */
public class App {

    public static void main(final String[] args) {
        final Logger LOGGER = LoggerFactory.getLogger(App.class);
        final com.programming.dev.math_functions.util.LinkedList linkedList = new com.programming.dev.math_functions.util.LinkedList();

        // build linked list
        linkedList.add(new com.programming.dev.math_functions.util.LinkedList.Node("1"));
        linkedList.add(new com.programming.dev.math_functions.util.LinkedList.Node("4"));
        linkedList.add(new com.programming.dev.math_functions.util.LinkedList.Node("5"));
        linkedList.add(new com.programming.dev.math_functions.util.LinkedList.Node("6"));
        linkedList.add(new com.programming.dev.math_functions.util.LinkedList.Node("7"));

        final MathFunctionsImpl mathFunctionsImpl = new MathFunctionsImpl();
        final Integer middleElement = mathFunctionsImpl.MiddleElementLinkedList(linkedList);

        LOGGER.debug(String.format("this is the middle element %s", middleElement.toString()));

        // build an array of numbers
        final java.util.List<Integer> inputArray = new ArrayList<Integer>();
        inputArray.add(2);
        inputArray.add(5);
        inputArray.add(8);
        inputArray.add(8);

        final Long duplicate = mathFunctionsImpl.FindDuplicateInArray(inputArray);

        LOGGER.debug(String.format("this is the duplicate element %s", duplicate));

        // reverse a string
        /*
         * String reversedString = mathFunctionsImpl.reverseString("today");
         * LOGGER.debug(String.format("this is the reversed string", reversedString));
         */
        final List<String> inputArrayList = new ArrayList<String>();
        List<String> outputArrayList = new ArrayList<String>();
        inputArrayList.add("devon");
        inputArrayList.add("sudhir");
        inputArrayList.add("devon");
        inputArrayList.add("ashok");
        inputArrayList.add("ericka");
        outputArrayList = mathFunctionsImpl.removeDuplicateMaintainOrder(inputArrayList);
        System.out.println("log the outputarray");

        final ArrayList<Integer> input = new ArrayList<Integer>();
        input.add(1);
        input.add(2);
        input.add(0);
        input.add(4);
        final int output = mathFunctionsImpl.LargestContinuousSum(input);
        LOGGER.debug(String.format("this is the largestContinuousSum %d ", output));

    }
}