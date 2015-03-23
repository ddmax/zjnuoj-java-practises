package Q1023;

import java.util.Scanner;

/**
 * Created by ddMax on 2015/03/21.
 */
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int k = input.nextInt();
		int n;
		double sn = 0;
		for (n = 1; ; n++) {
			sn += 1.0 / n;
			if (sn > k) break;
		}
		System.out.println(n);
		input.close();
	}
}
