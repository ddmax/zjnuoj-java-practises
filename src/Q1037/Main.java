package Q1037;

import java.util.*;

/**
 * Created by ddMax on 2015/03/22.
 */
public class Main {

	public static class Program {
		public int startTime, endTime;

		public Program(int startTime, int endTime) {
			this.startTime = startTime;
			this.endTime = endTime;
		}
	}

	public static Comparator<Program> compare = new Comparator<Program>() {
		@Override
		public int compare(Program p1, Program p2) {
			return p1.endTime - p2.endTime;
		}
	};

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int n = input.nextInt();
			if (n == 0) break;
			List<Program> programs = new ArrayList<Program>();
			int count = 1, temp;
			for (int i = 0; i < n; i++) {
				programs.add(new Program(input.nextInt(), input.nextInt()));
			}
			Collections.sort(programs, compare);
			temp = programs.get(0).endTime;
			for (int i = 1; i < n; i++) {
				if (programs.get(i).startTime >= temp) {
					count++;
					temp = programs.get(i).endTime;
				}
			}
			System.out.println(count);
		}
		input.close();
	}
}
