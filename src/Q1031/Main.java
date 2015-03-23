package Q1031;

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
		while (input.hasNext()) {
			int n = input.nextInt();
			int m = input.nextInt();
			if (m == 0 && n == 0) {
				break;
			}
			List<Integer> nums = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				nums.add(input.nextInt());
			}
			nums.add(m);
			Collections.sort(nums);
			for (Integer num : nums) {
				System.out.printf("%d ", num);
			}
			System.out.println();
		}
		input.close();
	}
}
