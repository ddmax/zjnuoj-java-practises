package Q1024;

import java.util.Scanner;

/**
 * Created by ddMax on 2015/03/21.
 */
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int score = input.nextInt();
			if (score >= 0 && score <= 100) {
				char grade;
				if (score >= 90) {
					grade = 'A';
				} else if (score >= 80) {
					grade = 'B';
				} else if (score >= 70) {
					grade = 'C';
				} else if (score >= 60) {
					grade = 'D';
				} else {
					grade = 'E';
				}
				System.out.println(grade);
			} else {
				System.out.println("Score is error!");
			}
		}
		input.close();
	}
}
