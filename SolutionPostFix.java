package com;

import java.util.Stack;

public class SolutionPostFix {

	public static void main(String[] args) {
		System.out.println(evaluatePostFix("231*+9-"));
	}

	public static int evaluatePostFix(String S) {
		String operators = "*+/-";
		Stack<Integer> stk = new Stack<Integer>();

		for (char c : S.toCharArray()) {

			Boolean flag = Character.isDigit(c);
			if (flag) {
				stk.add(Integer.parseInt(String.valueOf(c)));
			} else {
				if (operators.contains(String.valueOf(c))) {
					int val = 0;
					if (stk.size() >= 2) {
						int second = stk.pop();
						int first = stk.pop();
						val = evaluateBinaryExpression(first, second, String.valueOf(c));
						stk.add(val);

					} else {
						return -1;
					}
				} else {
					return -1;
				}
			}

		}
		return stk.pop();

	}

	public static int evaluateBinaryExpression(int first, int second, String operator) {
		int val = 0;
		if (operator.equalsIgnoreCase("*")) {
			val = first * second;
		} else if (operator.equalsIgnoreCase("+")) {
			val = first + second;
		} else if (operator.equalsIgnoreCase("/")) {
			val = first / second;
		} else {
			val = first - second;
		}

		return val;
	}
  }
