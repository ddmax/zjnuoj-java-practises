package Q1038;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ddMax on 2015/03/22.
 */
public class Main {

	public static int countDivisors(int num) {
		List<Integer> divisors = new ArrayList<Integer>();
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				divisors.add(i);
			}
		}
		for (Integer divisor : divisors) {
			sum += divisor;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m = input.nextInt();
		while (m-- > 0) {
			int a = input.nextInt();
			int b = input.nextInt();
			if (countDivisors(a) == b) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		input.close();
	}
}
