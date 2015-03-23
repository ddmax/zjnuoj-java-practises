package Q1021;

import java.util.Scanner;

/**
 * Created by ddMax on 2015/03/21.
 */
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int begin, length;
		String str;
		length = input.nextInt();
		str = input.next();
		begin = input.nextInt();
		System.out.println(str.substring(begin - 1, length));
		input.close();
	}
}
