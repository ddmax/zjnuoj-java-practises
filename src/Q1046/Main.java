package Q1046;

import java.util.*;

/**
 * Created by ddMax on 2015/03/22.
 */
public class Main {

	public static Integer[] primeFactors(int num) {
		Set<Integer> result = new TreeSet<Integer>();
		for (int i = 2; i < num; i++) {
			/**
			 * Pollard Rho因数分解：
			 * 不能整除肯定不是因数，能够整除在这里一定是质数。
			 * 因为所有的2, 3, 5, 7都被除完之后，剩下的因数
			 * 只能是奇数，且是质数。
			 * from: http://www.acmerblog.com/integer-factorization-5124.html
			 */
			while (num != i) {
				if (num % i != 0) {
					break;
				}
				result.add(i);
				num /= i;
			}
		}
		result.add(num);
		return result.toArray(new Integer[result.size()]);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int n = input.nextInt();
			Integer[] result = primeFactors(n);
			for (int i = 0; i < result.length; i++) {
				if (i != 0) {
					System.out.printf(" ");
				}
				System.out.printf("%d", result[i]);
			}
			System.out.println();
		}
	}
}
