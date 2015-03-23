package Q1005;

import java.util.Scanner;

/**
 * Created by ddMax on 2015/03/20.
 */
public class Main {

	public static int gcd(int a, int b) {
		// 辗转相除法
		while (b != 0) {
			int tmp = b;
			b = a % b;
			a = tmp;
		}
		return a;
	}

	public static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt(),
			b = input.nextInt();
		System.out.println(gcd(a, b) + " " + lcm(a, b));
		input.close();
	}
}
