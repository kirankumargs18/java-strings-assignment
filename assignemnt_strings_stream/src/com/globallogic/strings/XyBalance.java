package com.globallogic.strings;

public class XyBalance {

	/*
	 * Returns true if string contains equal number of x's and y's
	 */
	private static boolean xyBalance(String str) {

		int countX = countChar(str, 'x');
		int countY = countChar(str, 'y');

		if (countX == countY) {

			return true;
		}
		return false;
	}

	private static int countChar(String str, char c) {

		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		System.out.println(xyBalance("aaxbby"));
		System.out.println(xyBalance("aaxbb"));
		System.out.println(xyBalance("yaaxbb"));

	}

}
