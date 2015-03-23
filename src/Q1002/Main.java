package Q1002;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by ddMax on 2015/03/20.
 */
public class Main {

	public static final double PI = 3.14;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double r = input.nextDouble();
		double h = input.nextDouble();
		double C1 = 2 * PI * r,
				Sa = PI * r * r,
				Sb = 4 * PI * r * r,
				Va = 4 / 3.0 * PI * r * r * r,
				Vb = Sa * h;
		System.out.println("C1=" + new DecimalFormat(".00").format(C1));
		System.out.println("Sa=" + new DecimalFormat(".00").format(Sa));
		System.out.println("Sb=" + new DecimalFormat(".00").format(Sb));
		System.out.println("Va=" + new DecimalFormat(".00").format(Va));
		System.out.println("Vb=" + new DecimalFormat(".00").format(Vb));
		input.close();
	}
}
