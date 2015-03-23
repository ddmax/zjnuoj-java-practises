package Q1040;

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
			int count = 0;
			boolean isLengthMatches = false;
			String pwd = input.nextLine();
			if (pwd.matches("^.{8,16}$")) isLengthMatches = true;
			if (pwd.matches("(.*?)\\d+(.*?)")) count++;
			if (pwd.matches("(.*?)[a-z]+(.*?)")) count++;
			if (pwd.matches("(.*?)[A-Z]+(.*?)")) count++;
			if (pwd.matches("(.*?)[~!@#$%^]+(.*?)")) count++;
			System.out.println(isLengthMatches && count >= 3 ? "YES" : "NO");
		}
		input.close();
	}
}
