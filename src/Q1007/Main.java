package Q1007;

import java.util.Scanner;

/**
 * Created by ddMax on 2015/03/20.
 */
public class Main {

	public static void main(String[] args) {
		int peach = 1, n;
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		for (int i = 1; i < n; i++) {
			peach = (peach + 1) * 2;
		}
		System.out.println(peach);
		input.close();
	}
}
