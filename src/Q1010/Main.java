package Q1010;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ddMax on 2015/03/21.
 */
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<Integer> nums = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			nums.add(input.nextInt());
		}
		Collections.reverse(nums);
		for (int n : nums) {
			System.out.printf("%d ", n);
		}
		input.close();
	}
}
