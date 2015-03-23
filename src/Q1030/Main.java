package Q1030;

import java.util.Scanner;

/**
 * Created by ddMax on 2015/03/21.
 */
public class Main {

	public static int f(int year) {
		if (year <= 4) {
			return year;
		} else {
			return f(year - 1) + f(year - 3);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int year = input.nextInt();
			if (year == 0) {
				break;
			}
			System.out.println(f(year));
		}
		input.close();
	}
}
