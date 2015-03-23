package Q1015;

import java.util.Scanner;

/**
 * Created by ddMax on 2015/03/21.
 */
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char[] cs = input.nextLine().toCharArray();
		for (char c : cs) {
			System.out.printf("%c ", c);
		}
		input.close();
	}
}
