package Q1031;

import java.util.Scanner;

/**
 * Created by ddMax on 2015/03/21.
 */
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int n = input.nextInt();
			int m = input.nextInt();
			if (m == 0 && n == 0) {
				break;
			}
			int[] nums = new int[n];
			for (int i = 0; i < n; i++) {
				nums[i] = input.nextInt();
			}
			int i;
			for (i = 0; i < n; i++) {
				if (m < nums[i]) {
					System.out.printf("%d ", m);
					break;
				} else {
					System.out.printf("%d ", nums[i]);
				}
			}
			for (; i < n; i++) {
				System.out.printf("%d ", nums[i]);
			}
			System.out.println();
		}
		input.close();
	}
}
