package com.programming.dev.math_functions;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.programming.dev.math_functions.impl.MathFunctionsImpl;

/**
 * Hello world!
 */
public class App {

	public static void main(final String[] args) {
		Logger LOGGER = LoggerFactory.getLogger(App.class);
		com.programming.dev.math_functions.util.LinkedList linkedList = new com.programming.dev.math_functions.util.LinkedList();

		// build linked list
		linkedList
				.add(new com.programming.dev.math_functions.util.LinkedList.Node(
						"1"));
		linkedList
				.add(new com.programming.dev.math_functions.util.LinkedList.Node(
						"4"));
		linkedList
				.add(new com.programming.dev.math_functions.util.LinkedList.Node(
						"5"));
		linkedList
				.add(new com.programming.dev.math_functions.util.LinkedList.Node(
						"6"));
		linkedList
				.add(new com.programming.dev.math_functions.util.LinkedList.Node(
						"7"));

		MathFunctionsImpl mathFunctionsImpl = new MathFunctionsImpl();
		Integer middleElement = mathFunctionsImpl
				.MiddleElementLinkedList(linkedList);

		LOGGER.debug(String.format("this is the middle element %s",
				middleElement.toString()));

		// build an array of numbers
		java.util.List<Integer> inputArray = new ArrayList<Integer>();
		inputArray.add(2);
		inputArray.add(5);
		inputArray.add(8);
		inputArray.add(8);

		Long duplicate = mathFunctionsImpl.FindDuplicateInArray(inputArray);

		LOGGER.debug(String.format("this is the duplicate element %s",
				duplicate));

		// reverse a string
		String reversedString = mathFunctionsImpl.reverseString("today");
		LOGGER.debug(String.format("this is the reversed string",
				reversedString));
	}
}