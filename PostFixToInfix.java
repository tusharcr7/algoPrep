package com;

import java.util.Stack;

public class PostFixToInfix {
	public static void main(String[] args) {
		
		convertPostFixToInfix("ab*c+");
	}

	public static  void convertPostFixToInfix(String expression) {
		String validOperators = "*/+-";
		Stack<String> stk = new Stack<String>();

		for (char c : expression.toCharArray()) {

			boolean isChar = Character.isLetterOrDigit(c);
			if (isChar) {
				stk.add(String.valueOf(c));
			} else {
				if (validOperators.contains(String.valueOf(c))) {
					if (stk.size() >= 2) {
						String second = stk.pop();
						String first = stk.pop();
						String infix = "(" + first + c + second + ")";
						stk.push(infix);

					} else {
						System.out.println("Invalid Expression Detected");
						return;
					}
				} else {
					System.out.println("Invalid Expression Detected");
					return;
				}

			}
		}
		System.out.println(stk.pop());

	}
}
