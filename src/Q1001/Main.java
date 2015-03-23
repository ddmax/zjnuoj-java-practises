package Q1001;

import java.util.Scanner;

/**
 * Created by ddMax on 2015/03/20.
 */
public class Main {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		char[] str = input.nextLine().toCharArray();
		for (int i = 0; i < str.length; i++) {
			str[i] += 4;
		}
		System.out.println(String.valueOf(str));
		input.close();
	}
}
