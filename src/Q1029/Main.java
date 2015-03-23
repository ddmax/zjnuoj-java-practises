package Q1029;

import java.util.Scanner;

/**
 * Created by ddMax on 2015/03/21.
 */
public class Main {

	public static boolean isPrime(int num) {
		if (num == 1) return false;
		for (int i = 2; i <= (int) Math.sqrt((double) num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x, y;
		boolean isPrime = true;
		while (input.hasNext()) {
			x = input.nextInt();
			y = input.nextInt();
			if (x == 0 && y == 0) {
				break;
			}
			if (x > y) {
				int temp = x;
				x = y;
				y = temp;
			}
			for (int i = x; i <= y; i++) {
				if (isPrime(i * i + i + 41)) {
					isPrime = true;
				} else {
					isPrime = false;
					break;
				}
			}
			System.out.println(isPrime ? "OK" : "Sorry");
		}
		input.close();
	}
}
