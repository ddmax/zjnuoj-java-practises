package Q1020;

import java.util.*;

/**
 * Created by ddMax on 2015/03/21.
 */
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		List<Integer> monkeys = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			monkeys.add(i);
		}
		int counter = 1;
		ListIterator<Integer> iterator;
		while (monkeys.size() > 1) {
			iterator = monkeys.listIterator();
			while (iterator.hasNext()) {
				iterator.next();
				if (counter++ == 3) {
					iterator.remove();
					counter = 1;
				}
			}
		}
		System.out.println(monkeys.get(0));
		input.close();
	}
}
