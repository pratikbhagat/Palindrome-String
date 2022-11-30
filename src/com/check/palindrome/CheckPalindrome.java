package com.check.palindrome;

public class CheckPalindrome {

	// Using StringBuilder reverse() method
	private static boolean isPalindrome(String str) {
		if (str == null)
			return false;
		StringBuilder strBuilder = new StringBuilder(str);
		strBuilder.reverse();
		return strBuilder.toString().equals(str);
	}

	// Using for loop
	private static boolean isPalindromeString(String str) {
		if (str == null)
			return false;
		int length = str.length();
		for (int i = 0; i < length / 2; i++) {
			if (str.charAt(i) != str.charAt(length - i - 1))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {

		String s = "axyzzyxa";

		if (isPalindrome(s) == true)
			System.out.println("String '" + s + "' Is Palindrome");
		else
			System.out.println("String '" + s + "' Is not Palindrome");

		if (isPalindromeString(s) == true)
			System.out.println("String '" + s + "' Is Palindrome");
		else
			System.out.println("String '" + s + "' Is not Palindrome");
	}
}
