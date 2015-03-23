package Q1006;

import java.util.Scanner;

/**
 * Created by ddMax on 2015/03/20.
 */
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int counter = 1, an = 0, sn = 0;
		for (int i = n; i > 0; i--) {
			int multiple = 2 * counter;
			counter *= 10;
			an += multiple;
			sn += an;
		}
		System.out.println(sn);
		input.close();
	}
}
