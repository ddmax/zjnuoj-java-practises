package Q1016;

import java.util.Scanner;

/**
 * Created by ddMax on 2015/03/21.
 */
public class Main {

	public static String encrypt(String org) {
		char[] cs = org.toCharArray();
		for (int i = 0; i < cs.length; i++) {
			if ((cs[i] >= 'a' && cs[i] < 'z') || (cs[i] >= 'A' && cs[i] < 'Z')) {
				cs[i] += 1;
			} else if (cs[i] == 'z') {
				cs[i] = 'a';
			} else if (cs[i] == 'Z') {
				cs[i] = 'A';
			} else {
			}
		}
		return String.valueOf(cs);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String result = encrypt(input.nextLine());
		System.out.println(result);
		input.close();
	}
}
