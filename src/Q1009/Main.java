package Q1009;

import java.util.Scanner;

/**
 * Created by ddMax on 2015/03/21.
 */
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] matrix = new int[3][3];
		int main = 0, counter = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrix[i][j] = input.nextInt();
			}
		}
		main += matrix[0][0] + matrix[1][1] + matrix[2][2];
		counter += matrix[0][2] + matrix[1][1] + matrix[2][0];
		System.out.println(main + " " + counter);
		input.close();
	}
}
