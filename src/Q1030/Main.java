package Q1030;

import java.util.Scanner;

/**
 * Created by ddMax on 2015/03/21.
 */
public class Main {

	public static void main(String[] args) {
		long[] dp = new long[56];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 3;
		for (int i = 4; i <= 55; i++) {
			dp[i] = dp[i - 1] + dp[i - 3];
		}
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int year = input.nextInt();
			if (year == 0) {
				break;
			}
			System.out.println(dp[year]);
		}
		input.close();
	}
}
