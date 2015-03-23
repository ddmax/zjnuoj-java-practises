package Q1034;

import java.util.Scanner;

/**
 * Created by ddMax on 2015/03/22.
 */
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNextLine()) {
			char[] str = input.nextLine().toCharArray();
			for (int i = 0; i < str.length - 1; i++) {
				if (i == 0) {
					str[i] -= 32;
				}
				if (str[i] == ' ') {
					if ((str[i + 1] >= 'A' && str[i + 1] <= 'Z') ||
							str[i + 1] >= 'a' && str[i + 1] <= 'z') {
						str[i + 1] -= 32;
					}

				}
			}
			System.out.println(String.valueOf(str));
		}
		input.close();
	}
}
