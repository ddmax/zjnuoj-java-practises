package Q1017;

import java.util.Scanner;

/**
 * Created by ddMax on 2015/03/21.
 */
public class Main {

	public static void printAscend(String[] strs) {
		String temp;
		for (int i = 0; i < strs.length - 1; i++) {
			for (int j = 0; j < strs.length - i - 1; j++) {
				if (strs[j + 1].compareTo(strs[j]) < 0) {
					temp = strs[j];
					strs[j] = strs[j + 1];
					strs[j + 1] = temp;
				}
			}
		}
		for (String s : strs) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] strs = new String[3];
		for (int i = 0; i < 3; i++) {
			strs[i] = input.nextLine();
		}
		printAscend(strs);
		input.close();
	}
}
