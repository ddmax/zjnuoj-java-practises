package Q1022;

import java.util.Scanner;

/**
 * Created by ddMax on 2015/03/21.
 */
public class Main {

	public static String concat(String a, String b, int position) {
		char[] result = new char[a.length() + b.length()];
		int i, j;
		for (i = 0; i < position; i++) {
			result[i] = a.charAt(i);
		}
		for (j = 0; j < b.length(); j++) {
			result[i + j] = b.charAt(j);
		}
		for (int k = i + j; k < result.length; k++) {
			result[k] = a.charAt(i++);
		}
		return String.valueOf(result);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		while (n-- > 0) {
			String a = input.next();
			String b = input.next();
			int count = 0;
			for (int pos = 0; pos <= a.length(); pos++) {
				String str = concat(a, b, pos);

				boolean isInverse = true;
				for (int i = 0; i < str.length() / 2; i++) {
					if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
						isInverse = false;
						break;
					}
				}
				if (isInverse) {
					count++;
				}
			}
			System.out.println(count);
		}
		input.close();
	}
}
