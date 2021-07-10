package com;

import java.util.Scanner;

public class RotateArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {

			int len = sc.nextInt();
			int rot = sc.nextInt();
			int arr[] = new int[len];
			for (int j = 0; j < len; j++)
				arr[j] = sc.nextInt();

			int l = 0, r = rot - 1;
			while (l < r) {

				int temp = arr[l];
				arr[l] = arr[r];
				arr[r] = temp;
				l++;
				r--;
			}
			l = rot;
			r = len - 1;
			while (l < r) {

				int temp = arr[l];
				arr[l] = arr[r];
				arr[r] = temp;
				l++;
				r--;
			}
			l = 0;
			r = len - 1;
			while (l < r) {

				int temp = arr[l];
				arr[l] = arr[r];
				arr[r] = temp;
				l++;
				r--;
			}

			for (int x : arr) {
				System.out.print(x+ " ");
				
			}
			System.out.println();
		}

	}
}
