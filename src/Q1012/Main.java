package Q1012;

import java.util.Scanner;

/**
 * Created by ddMax on 2015/03/21.
 */
public class Main {

	public static int[][] transpose(int[][] matrix) {
		int[][] after = new int[matrix.length][matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				after[j][i] = matrix[i][j];
			}
		}
		return after;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] matrix = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrix[i][j] = input.nextInt();
			}
		}
		int[][] transed = transpose(matrix);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("%d ", transed[i][j]);
			}
			System.out.printf("\n");
		}
		input.close();
	}
}
