package Q1000;

import java.util.Scanner;

/**
 * Created by ddMax on 2015/03/20.
 */
public class Main {

	public static int Maxmium(int a, int b, int c) {
		int max = a;
		if (a < b) max = b;
		if (a < c) max = c;
		return max;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt(),
				b = input.nextInt(),
				c = input.nextInt();
		System.out.println(Maxmium(a, b, c));
		input.close();
	}
}