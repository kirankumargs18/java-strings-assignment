package com.globallogic.strings;

public class LastNRepetitionOfString {

	/*
	 * Given a string and an int n, return a string made of n repetitions of the
	 * last n characters of the string. You may assume that n is between 0 and the
	 * length of the string, inclusive
	 */
	private static String repeatEnd(String str, int n) {
		String result = "";

		String temp = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			if (temp.length() != n) {
				temp = temp + str.charAt(i);
			} else if (temp.length() == n) {
				break;
			}
		}

		for (int k = 1; k <= n; k++) {
			result += temp;
		}

		return result;
	}

	public static void main(String[] args) {

		String res = repeatEnd("Hello", 3);
		System.out.println(res);

		String res1 = repeatEnd("Hello", 2);
		System.out.println(res1);

		String res2 = repeatEnd("Hello", 1);
		System.out.println(res2);

	}

}
