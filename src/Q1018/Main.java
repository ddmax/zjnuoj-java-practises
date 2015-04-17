package Q1018;

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
		swap(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		input.close();
	}

	public static void swap(int[] nums) {
		int max = 0, min = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > nums[max]) {
				max = i;
			}
			if (nums[i] < nums[min]) {
				min = i;
			}
		}
		int temp;
		// 注意：必须先将最大值与最后一个数先交换，
		// 然后最小值与第一个数交换，否则不通过！
		temp = nums[nums.length - 1];
		nums[nums.length - 1] = nums[max];
		nums[max] = temp;
		temp = nums[0];
		nums[0] = nums[min];
		nums[min] = temp;
	}
}
