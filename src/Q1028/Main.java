package Q1028;

import java.util.Scanner;

/**
 * Created by ddMax on 2015/03/21.
 */
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m, n, a, b, c, i, k;
		while (input.hasNext()) {
			m = input.nextInt();
			n = input.nextInt();
			k = 0;
			if (m >= 100 && n >= m && n <= 999) {
				for (i = m; i <= n; i++) {
					a = i / 100;
					b = i / 10 % 10;
					c = i % 10;
					if (i == a * a * a + b * b * b + c * c * c) {
						System.out.printf("%d ", i);
						k++;
					}
				}
				if (k == 0) {
					System.out.println("no");
				} else {
					System.out.println();
				}
			}
		}
		input.close();
	}
}
