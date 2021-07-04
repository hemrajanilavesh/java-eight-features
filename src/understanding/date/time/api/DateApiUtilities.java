package understanding.date.time.api;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class DateApiUtilities {

	public static void main(String[] args) {

		// instances of any class in java.time package are immutable
		LocalDate today = LocalDate.now();

		DayOfWeek dayOfWeek = today.getDayOfWeek();
		System.out.println("Day of Week : " + dayOfWeek);
		System.out.println("Day of Week Num : " + dayOfWeek.getValue());

		Month month = today.getMonth();
		System.out.println("Month : " + month);
		System.out.println("Month Num : " + month.getValue());

		System.out.println("Is " + today.getYear() + " a leap year ? : " + today.isLeapYear());

		System.out.println("Is " + today + " after " + today.minusDays(1) + " ? : " + today.isAfter(today.minusDays(1)));

		System.out.println("Is " + today.minusDays(1) + " before " + today + " ? : " + today.minusDays(1).isBefore(today));

		System.out.println(today.getYear() + " comes five years after " + today.minusYears(5).getYear());

		System.out.println(today.plusYears(5).getYear() + " comes five years after " + today.getYear());

	}

}
