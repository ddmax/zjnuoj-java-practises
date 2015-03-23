package Q1008;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ddMax on 2015/03/21.
 */
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums = new int[10];
		for (int i = 0; i < 10; i++) {
			nums[i] = input.nextInt();
		}
		Arrays.sort(nums);
		for (int n : nums) {
			System.out.println(n);
		}
		input.close();
	}
}
