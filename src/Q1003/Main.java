package Q1003;

import java.util.Scanner;

/**
 * Created by ddMax on 2015/03/20.
 */
public class Main {

	public static int fx(int x) {
		if (x < 1) {
			return x;
		} else if (x >= 1 && x < 10) {
			return 2 * x - 1;
		} else {
			return 3 * x - 11;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(fx(input.nextInt()));
		input.close();
	}
}
