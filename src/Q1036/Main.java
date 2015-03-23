package Q1036;

import java.util.Scanner;

/**
 * Created by ddMax on 2015/03/22.
 */
public class Main {

	public static String convertRadix(int n, int r) {
		char[] result = new char[32];
		StringBuilder sb = new StringBuilder();
		int i = 0;
		// Deal with 0
		if (n == 0) {
			return "0";
		}
		// Deal with negative number
		if (n < 0) {
			sb.append("-");
			n = -n;
		}
		// Mod r until n is 0
		while (n > 0) {
			result[i++] = (char) (n % r > 9 ? n % r - 10 + 'A' : n % r + '0');
			n /= r;
		}
		// convert to String
		for (int j = i - 1; j >= 0; j--) {
			sb.append(result[j]);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int n = input.nextInt();
			int r = input.nextInt();
			System.out.println(convertRadix(n, r));
		}
		input.close();
	}
}
