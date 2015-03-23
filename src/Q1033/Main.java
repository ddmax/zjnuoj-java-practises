package Q1033;

import java.util.Scanner;

/**
 * Created by ddMax on 2015/03/22.
 */
public class Main {

	public static void print(double r[], int n) {
		for (int i = 0; i < n; i++) {
			if (i != 0) {
				System.out.printf(" ");
			}
			System.out.printf("%.2f", r[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double r[] = new double[50];
		double r2[] = new double[5];
		int a[][] = new int[50][5];
		int n, m, i, j, c;
		while (input.hasNext()) {
			n = input.nextInt();
			m = input.nextInt();
			for (j = 0; j < m; j++) {
				r2[j] = 0;
			}
			for (i = 0; i < n; i++) {
				r[i] = 0;
				for (j = 0; j < m; j++) {
					a[i][j] = input.nextInt();
					r[i] += a[i][j];
					r2[j] += a[i][j];
				}
				r[i] /= m;
			}
			for (j = 0; j < m; j++) {
				r2[j] /= n;
			}
			c = 0;
			for (i = 0; i < n; i++) {
				for (j = 0; j < m; j++) {
					if (a[i][j] < r2[j]) {
						break;
					}
				}
				if (j >= m) {
					c++;
				}
			}
			print(r, n);
			print(r2, m);
			System.out.printf("%d\n\n", c);
		}
		input.close();
	}
}
