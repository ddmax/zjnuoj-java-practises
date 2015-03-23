package Q1043;

import java.util.Scanner;

/**
 * Created by ddMax on 2015/03/22.
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

	public static int divide(int n) {
		int count = 0;
		for (int i = 2; i < n / 2; i++) {
			int j = n - i;
			if (isPrime(i) && isPrime(j)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int n = input.nextInt();
			if (n == 0) {
				break;
			}
			System.out.println(divide(n));
		}
		input.close();
	}
}
