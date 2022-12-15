package com.globallogic.strings;

public class BobThere {

	/*
	 * Return true if the given string contains a "bob" string, but where the middle
	 * 'o' char can be any char.
	 */
	private static boolean bobThere(String str) {

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		System.out.println(bobThere("abcbob"));
		System.out.println(bobThere("b9b"));
		System.out.println(bobThere("bac"));

	}

}
