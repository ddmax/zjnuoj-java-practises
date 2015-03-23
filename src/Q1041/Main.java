package Q1041;

import java.util.Scanner;

/**
 * Created by ddMax on 2015/03/22.
 */
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.nextLine();
		while (n-- > 0) {
			String phonenums = input.nextLine();
			System.out.println("6" + phonenums.substring(6, 11));
		}
		input.close();
	}
}
