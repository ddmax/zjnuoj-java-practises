package Q1011;

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
		int num = input.nextInt();
		System.out.printf(isPrime(num) ? "prime" : "not prime");
		input.close();
	}
}
