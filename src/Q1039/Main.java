package Q1039;

import java.util.Scanner;

/**
 * Created by ddMax on 2015/03/22.
 */
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long[] dp = new long[41];
		int i, n, m;
		dp[1] = 0;
		dp[2] = 1;
		dp[3] = 2;
		for (i = 4; i <= 40; i++) {
			dp[i] = dp[i - 2] + dp[i - 1];
		}
		n = input.nextInt();
		while (n-- > 0) {
			m = input.nextInt();
			System.out.println(dp[m]);
		}
		input.close();
	}
}
