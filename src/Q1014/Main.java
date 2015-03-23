package Q1014;

import java.util.Scanner;

/**
 * Created by ddMax on 2015/03/21.
 */
public class Main {

	public static void printVowel(String org) {
		char[] tmp = org.toCharArray();
		for (char c : tmp) {
			if (c == 'a' || c == 'e' || c == 'i' ||
					c == 'o' || c == 'u') {
				System.out.printf("%c", c);
			}
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		printVowel(s);
		input.close();
	}
}
