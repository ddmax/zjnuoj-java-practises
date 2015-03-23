package Q1032;

import java.util.Scanner;

/**
 * Created by ddMax on 2015/03/21.
 */
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int n = input.nextInt();
			int[] nums = new int[n];
			if (n == 0) {
				break;
			}
			for (int i = 0; i < n; i++) {
				nums[i] = input.nextInt();
			}
			for (int i = 0; i < nums.length - 1; i++) {
				for (int j = 0; j < nums.length - i - 1; j++) {
					if (Math.abs(nums[j]) < Math.abs(nums[j + 1])) {
						int temp = nums[j];
						nums[j] = nums[j + 1];
						nums[j + 1] = temp;
					}
				}
			}
			for (int num : nums) {
				System.out.printf("%d ", num);
			}
			System.out.println();
		}
	}
}
