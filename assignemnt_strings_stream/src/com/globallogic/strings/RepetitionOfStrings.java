package com.globallogic.strings;

public class RepetitionOfStrings {

	/*
	 * Given a string and an int n, return a string made of the first n characters
	 * of the string, followed by the first n-1 characters of the string, and so on.
	 * You may assume that n is between 0 and the length of the string, inclusive.
	 */
	private static String repeatFront(String str, int n) {

		String resultString = "";

		while (n > 0) {
			resultString += str.substring(0, n);
			n--;
		}

		return resultString;
	}

	public static void main(String[] args) {

		System.out.println(repeatFront("Chocolate", 4));
		System.out.println(repeatFront("Chocolate", 3));
		System.out.println(repeatFront("Chocolate", 2));

	}

}
