package com.programming.dev.math_functions;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.programming.dev.math_functions.impl.MathFunctionsImpl;
import com.programming.dev.math_functions.util.TreeNode;

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
        input.add(3);
        input.add(4);
        input.add(5);
        input.add(6);
        ArrayList<Integer> output = new ArrayList<Integer>();
        output = mathFunctionsImpl.LargestContinuousSum(input);

        /*
         * input.clear(); output = mathFunctionsImpl.LargestContinuousSum(input);
         */

        final int outputResult = mathFunctionsImpl.BinarySearch(input, 7);
        LOGGER.debug(String.format("the binary search result is %d", outputResult));

        input.clear();
        input.add(5);
        input.add(2);
        input.add(3);
        input.add(1);

        ArrayList<Integer> outputArray = new ArrayList<Integer>();
        outputArray = mathFunctionsImpl.bubbleSort(input);
        LOGGER.debug(String.format("the binary search result is %d", outputResult));

        final int[] inputArray1 = { 3, 2, 1, 4 };
        mathFunctionsImpl.selectionSort(inputArray1);

        final int[] inputArray2 = { 567, 8, 9, 5, 6 };
        final Boolean result = mathFunctionsImpl.intersectionOfArryays(inputArray1, inputArray2);
        LOGGER.debug(String.format("the intersection of the two arrays is %s", result.toString()));

        mathFunctionsImpl.nextHighestNumber(12345);

        final TreeNode left1 = new TreeNode();
        left1.setData(2);

        final TreeNode right1 = new TreeNode();
        right1.setData(3);

        final TreeNode root = new TreeNode();
        root.setData(1);
        root.setRight(right1);
        root.setLeft(left1);
        // mathFunctionsImpl.printReverseLevelOrder(root);

        final TreeNode root2 = new TreeNode();
        root.setData(1);
        final TreeNode left2 = new TreeNode();
        left1.setData(3);
        root.setLeft(left2);
        final TreeNode left3 = new TreeNode();
        left3.setData(6);
        left2.setLeft(left3);
        final TreeNode right2 = new TreeNode();
        right1.setData(2);
        final TreeNode right3 = new TreeNode();
        right3.setData(4);
        right2.setRight(right3);
        root.setRight(right2);

        mathFunctionsImpl.equalityOfBSTNoStructureRelevance(root, root2);
        mathFunctionsImpl.lowestCommonAncestor(root, right3, left3);

        printString(300);

        mathFunctionsImpl.powerSet("an");
        final Runnable runnable = new Runnable() {

            public void run() {
                while (true) {

                }

            }
        };

        final TimerTask task = new TimerTask() {
            Timer timer = new Timer();

            @Override
            public void run() {
                // TODO Auto-generated method stub

            }
        };
        final int test = Character.getNumericValue('1');
        // System.out.println(test);
    }

    static void printString(int k) {
        final char[] str = new char[20];
        int i = 0;
        while (k > 0) {
            final int rem = k % 26;
            if (rem == 0) {
                str[i++] = 25 + 97;
                k = ((k) / 26) - 1;
                continue;
            } else {
                str[i++] = (char) ((rem - 1) + 97);
                k = k / 26;
            }
            if (k == 0 || (k == 1 && rem == 0)) {
                break;
            }
        }
        str[i] = '\0';
        // System.out.println(str);

        final String sudhir = "abcde";
        final String temp = sudhir.substring(1);
        final char temp1 = sudhir.charAt(0);
        System.out.printf("this is the substring", sudhir.substring(1));
    }
}