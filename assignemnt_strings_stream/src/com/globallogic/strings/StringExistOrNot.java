package com.globallogic.strings;

public class StringExistOrNot {

	/*
	 * Return true if the given string contains an appearance of "xyz" where the xyz
	 * is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does
	 * not
	 */
	private static boolean xyzThere(String str) {

		if (!str.contains("xyz")) {
			return false;
		} else if (str.contains("xyz") && !str.contains(".")) {
			return true;
		} else if (str.contains("xyz") && str.contains(".")) {
			int index = str.indexOf("xyz");

			if (index != 0 && str.charAt(index - 1) == '.') {
				return false;
			}

		}

		return true;

	}

	public static void main(String[] args) {

		System.out.println(xyzThere("abcxyz"));

		System.out.println(xyzThere("abc.xyz"));

		System.out.println(xyzThere("xyz.abc"));
	}

}
