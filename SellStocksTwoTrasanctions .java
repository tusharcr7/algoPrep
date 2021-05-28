import java.util.Arrays;
import java.util.Scanner;

public class SellStocksTwoTrasanctions {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		int dplr[] = new int[n];
		int currP = 0, least = arr[0];
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] < least)
				least = arr[i];

			currP = arr[i] - least;

			dplr[i] = dplr[i - 1] > currP ? dplr[i - 1] : currP;

		}

		int currPrl = 0, max = arr[arr.length - 1];

		int dprl[] = new int[n];
		for (int i = arr.length - 2; i >= 0; i--) {

			if (arr[i] < max)
				max = arr[i];

			currPrl = max - arr[i];
			dprl[i] = dprl[i + 1] > currPrl ? dprl[i + 1] : currPrl;
		}
		int maxProfit = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			maxProfit = (dprl[i] + dplr[i]) > maxProfit ? (dprl[i] + dplr[i]) : maxProfit;
		}

		System.out.println(maxProfit);
	}
}
