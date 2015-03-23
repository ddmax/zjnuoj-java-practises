package Q1025;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by ddMax on 2015/03/21.
 */
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			try {
				Date date = new SimpleDateFormat("yyyy/MM/dd").parse(input.nextLine());
				Calendar calendar = Calendar.getInstance();
				calendar.setTime(date);
				System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
	}
}
