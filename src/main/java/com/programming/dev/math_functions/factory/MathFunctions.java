package com.programming.dev.math_functions.factory;

import java.util.ArrayList;
import java.util.List;

import com.programming.dev.math_functions.util.TreeNode;

/**
 * Interface for utilities in math most commonly used. mohanraj,sudhir
 */
public interface MathFunctions {

    // public abstract int MiddleE lementLinkedList(com.programming.dev.math_functions.util.LinkedList linkedList);

    public abstract Long FindDuplicateInArray(List<Integer> arrayNumbers);

    public abstract String reverseString(String input);

    public abstract List<String> removeDuplicateMaintainOrder(List<String> arrayWithDuplicates);

    public abstract ArrayList<Integer> LargestContinuousSum(ArrayList<Integer> input);

    public abstract int BinarySearch(ArrayList<Integer> sortedArray, int elementToFind);

    public abstract ArrayList<Integer> bubbleSort(ArrayList<Integer> inputArray);

    public abstract int[] selectionSort(int[] input);

    public abstract int lowestCommonAncestor(TreeNode root, TreeNode right, TreeNode left);

    public abstract Boolean intersectionOfArryays(int[] inputArray1, int[] inputArray2);

    public abstract String[] removedDuplicatesInorder(String input);

    public abstract ArrayList<Integer> levelOrderTraversal(TreeNode treeNode);

    public abstract ArrayList<Integer> levelOrderTraversalV2(TreeNode treeNode);

    public abstract String nextHighestNumber(Integer input);

    public abstract ArrayList<Integer> printReverseLevelOrder(TreeNode root);

    public abstract Boolean equalityOfBSTNoStructureRelevance(TreeNode root1, TreeNode root2);

    public abstract void treetoDoublyLinkedList(TreeNode root, TreeNode lastNode, TreeNode head);

    public abstract void powerSet(String inputString);

    public abstract void printAllPaths(int[][] A, int i, int j, String soFar);
}
