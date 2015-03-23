package Q1026;

import java.util.Scanner;

/**
 * Created by ddMax on 2015/03/21.
 */
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int n = input.nextInt();
			if (n > 0) {
				double[] num = new double[n];
				int positive = 0, negative = 0, zero = 0;
				for (int i = 0; i < n; i++) {
					num[i] = input.nextDouble();
				}
				for (double a : num) {
					if (a > 0) {
						positive++;
					} else if (a < 0) {
						negative++;
					} else {
						zero++;
					}
				}
				System.out.printf("%d %d %d\n", negative, zero, positive);
			}
		}
		input.close();
	}
}
