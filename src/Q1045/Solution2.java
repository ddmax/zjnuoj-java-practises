package Q1045;

import java.util.Scanner;

/**
 * Created by ddMax on 2015/03/22.
 * Language: Java
 * Time: 92ms
 */
public class Solution2 {

	public static int lcm(int a, int b) {
		int r, m = a, n = b;
		if (m < n) {
			m = m ^ n;
			n = m ^ n;
			m = m ^ n;
		}
		r = m % n;
		while (r != 0) {
			m = n;
			n = r;
			r = m % n;
		}
		return a * b / n;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int a = input.nextInt();
			int	b = input.nextInt();
			System.out.println(lcm(a, b));
		}
		input.close();
	}
}
