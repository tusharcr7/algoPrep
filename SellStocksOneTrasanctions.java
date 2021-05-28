
import java.util.Scanner;

public class SellStocksOneTrasanctions {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		int p = 0, currP = 0, least = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < least)
				least = arr[i];

			currP = arr[i] - least;

			p = p <= currP ? currP : p;

		}
		System.out.println(p);
	}
}
