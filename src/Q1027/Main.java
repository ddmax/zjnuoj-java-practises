package Q1027;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by ddMax on 2015/03/21.
 */
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, m;
		while (input.hasNext()) {
			n = input.nextInt();
			m = input.nextInt();
			double sn = 0, an = n;
			for (int i = 0; i < m; i++) {
				sn += an;
				an = Math.sqrt(an);
			}
			System.out.println(new DecimalFormat(".00").format(sn));
		}
		input.close();
	}
}
