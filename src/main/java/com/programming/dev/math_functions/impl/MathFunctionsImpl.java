package com.programming.dev.math_functions.impl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.programmin.dev.math_functions.factory.MathFunctions;

/**
 * Implementation for {@link MathFunctions}
 * 
 * @author mohanraj,sudhir
 */
public class MathFunctionsImpl implements MathFunctions {

	public int MiddleElementLinkedList(
			com.programming.dev.math_functions.util.LinkedList linkedList) {
		com.programming.dev.math_functions.util.LinkedList.Node head = linkedList
				.head();
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

	public Long FindDuplicateInArray(List<Integer> inputArray) {
		Integer size = inputArray.size();
		Long expectedSum = (long) (size * (size + 1));

		Long actualSum = 0L;
		for (Integer each : inputArray) {
			actualSum = actualSum + each;
		}
		return expectedSum - actualSum;
	}

	public String reverseString(String input) {
		if (input.length() < 2) {
			return input;
		}
//		String temp = input.substring(1);
//		char temp1 = input.charAt(0);
		return reverseString(input.substring(1) + input.charAt(0));
	}

}
