package com;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class PrintAllPalindromeString {

	public static void main(String[] args) {

	}

	static ArrayList<ArrayList<String>> allPalindromicPerms(String S) {
		ArrayList<ArrayList<String>> a = new ArrayList<ArrayList<String>>();
		Deque<String> c = new LinkedList<String>();
		allPalindromicPerms(a, c, 0, S.length(), S);
		return a;
	}

	static ArrayList<ArrayList<String>> allPalindromicPerms(ArrayList<ArrayList<String>> a, Deque<String> c, int s,
			int n, String input) {

		if (s >= n) {
			a.add(new ArrayList<String>(c));
		}

		for (int i = s; i < n; i++) {

			if (isPalindrome(input, s, i)) {

				c.addLast(input.substring(s, i+1));
				allPalindromicPerms(a, c, i + 1, n, input);

				c.removeLast();
			}
		}

		return a;

	}

	static boolean isPalindrome(String st, int s, int e) {

		while (s < e) {
			if (st.charAt(s) != st.charAt(e))
				return false;

			s++;
			e--;
		}
		return true;

	}

}
