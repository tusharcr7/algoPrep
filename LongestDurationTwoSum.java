package com;

import java.util.Arrays;
import java.util.HashSet;

public class LongestDurationTwoSum {
	int index1 = 0, index2 = 0;

	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<Integer>();
		int minDif = Integer.MAX_VALUE, num1 = 0, num2 = 0;
		int arr[] = { 27, 1, 10, 39, 12, 52, 32, 67, 76 };
		int sum = 77;
		Arrays.sort(arr);
		int l = 0, r = arr.length - 1;
		while (l < r) {
			int dif = Math.abs((arr[l] + arr[r]) - sum);

			if (minDif >= dif) {
				if (minDif > dif) {
					minDif = dif;
					num1 = arr[l];
					num2 = arr[r];
				} else {
					if (Math.max(num1, num2) < Math.max(arr[l], arr[r])) {
						num1 = arr[l];
						num2 = arr[r];
					}
				}

			}
			if ((arr[l] + arr[r]) > sum) {
				r--;
			} else
				l++;

		}
		System.out.println(num1 + " " + num2);
	}

}
