package Q1018;

import java.util.Scanner;

/**
 * Created by ddMax on 2015/03/21.
 */
public class Main {

	public static int[] findMaxAndMinPos(int[] nums) {
		int max = 0;
		int min = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > nums[max]) {
				max = i;
			}
			if (nums[i] < nums[min]) {
				min = i;
			}
		}
		return new int[]{max, min};
	}

	public static void swap(int[] nums) {
		int[] maxAndMin = findMaxAndMinPos(nums);
		int temp;
		temp = nums[nums.length - 1];
		nums[nums.length - 1] = nums[maxAndMin[0]];
		nums[maxAndMin[0]] = temp;
		temp = nums[0];
		nums[0] = nums[maxAndMin[1]];
		nums[maxAndMin[1]] = temp;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums = new int[10];
		for (int i = 0; i < 10; i++) {
			nums[i] = input.nextInt();
		}
		swap(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("%d ", nums[i]);
		}
	}
}
