package Q1042;

import java.util.Scanner;

/**
 * Created by ddMax on 2015/03/22.
 */
public class Main {

	public static int convertRadixAndSumUp(int n, int r) {
		int[] result = new int[32];
		int sum = 0;
		int i = 0;
		// Mod r until n is 0
		while (n > 0) {

			result[i++] = n % r;
			n /= r;
		}
		// Sum up
		for (int j = i - 1; j >= 0; j--) {
			sum += result[j];
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int n = input.nextInt();
			if (n == 0) {
				break;
			}
			if ((convertRadixAndSumUp(n, 10) == convertRadixAndSumUp(n, 16)) &&
					(convertRadixAndSumUp(n, 10) == convertRadixAndSumUp(n, 12))) {
				System.out.println(n + " is a Sky Number.");
			} else {
				System.out.println(n + " is not a Sky Number.");
			}

		}
		input.close();
	}
}
