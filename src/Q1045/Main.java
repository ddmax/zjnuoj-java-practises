package Q1045;

import java.util.Scanner;

/**
 * Created by ddMax on 2015/03/22.
 * Language: Java
 * Time: 639ms
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
		while (input.hasNext()) {
			int a = input.nextInt();
			int	b = input.nextInt();
			System.out.println(lcm(a, b));
		}
		input.close();
	}
}
