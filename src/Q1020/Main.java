package Q1020;

import java.util.*;

/**
 * Created by ddMax on 2015/03/21.
 */
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		List<Integer> people = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			people.add(i + 1);
		}
		int counter = 1;
		ListIterator<Integer> iterator;
		while (people.size() > 1) {
			iterator = people.listIterator();
			while (iterator.hasNext()) {
				iterator.next();
				if (counter++ == 3) {
					iterator.remove();
					counter = 1;
				}
			}
		}
		System.out.println(people.get(0));
		input.close();
	}
}
