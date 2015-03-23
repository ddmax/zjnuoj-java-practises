package Q1019;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by ddMax on 2015/03/21.
 */
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		LinkedList<Integer> nums = new LinkedList<Integer>();
		for (int i = 0; i < n; i++) {
			nums.add(input.nextInt());
		}
		int m = input.nextInt();
		while (m-- > 0) {
			nums.addFirst(nums.removeLast());
		}
		for (int i = 0; i < n; i++) {
			System.out.printf("%d ", nums.get(i));
		}
		input.close();
	}
}
