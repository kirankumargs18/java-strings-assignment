package com.globallogic.strings;

/*
 * Given two strings, a and b, create a bigger string made of the first char of a, 
 * the first char of b, the second char of a, the second char of b, and so on. 
 * Any leftover chars go at the end of the result.
 * 
 * */
public class MixString {

	private static String mixString(String str1, String str2) {

		String result = "";

		if (str1.length() >= str2.length()) {
			for (int i = 0; i < str1.length(); i++) {
				result += str1.charAt(i);
				for (int j = i; j < str2.length();) {
					result += str2.charAt(j);
					break;
				}
			}
		} else if (str2.length() >= str1.length()) {
			for (int i = 0; i < str2.length(); i++) {
				result += str2.charAt(i);
				for (int j = i; j < str1.length();) {
					result += str1.charAt(j);
					break;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {

		System.out.println(mixString("abc", "xyz"));

		System.out.println(mixString("xxxx", "There"));

		System.out.println(mixString("Hi", "There"));

	}

}
