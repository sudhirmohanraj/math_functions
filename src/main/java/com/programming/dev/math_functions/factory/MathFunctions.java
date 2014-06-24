package com.programming.dev.math_functions.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * Interface for utilities in math most commonly used. mohanraj,sudhir
 */
public interface MathFunctions {

    public abstract int MiddleElementLinkedList(com.programming.dev.math_functions.util.LinkedList linkedList);

    public abstract Long FindDuplicateInArray(List<Integer> arrayNumbers);

    public abstract String reverseString(String input);

    public abstract List<String> removeDuplicateMaintainOrder(List<String> arrayWithDuplicates);

    public abstract int LargestContinuousSum(ArrayList<Integer> input);
}
