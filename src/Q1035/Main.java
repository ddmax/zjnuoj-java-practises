package Q1035;

import java.util.Scanner;

/**
 * Created by ddMax on 2015/03/22.
 */
public class Main {

	public static final String target = "aeiou";

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.nextLine();
		while (n-- > 0) {
			String str = input.nextLine().toLowerCase();
			int result[] = new int[5];
			for (int i = 0; i < str.length(); i++) {
				int position = target.indexOf(str.charAt(i));
				if (position != -1) {
					result[position]++;
				}
			}
			for (int i = 0; i < result.length; i++) {
				System.out.println(target.charAt(i) + ":" + result[i]);
			}
			if (n > 0) {
				System.out.println();
			}
		}
		input.close();
	}
}
