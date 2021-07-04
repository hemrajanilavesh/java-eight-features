package understanding.date.time.api;

import java.time.LocalDate;
import java.time.ZoneId;

public class LocalDateExample {

	public static void main(String[] args) {
		// Obtains the current date from the system clock in the default
		// time-zone.
		LocalDate today = LocalDate.now();
		System.out.println("Current Date->" + today);

		// obtain the 1st day of 2018
		LocalDate first_day_2018 = LocalDate.of(2018, 01, 01);
		System.out.println("First Day of 2018->" + first_day_2018);

		// obtain nth day from base epoch date i.e. 01-01-1970
		LocalDate fromEpoch = LocalDate.ofEpochDay(365);
		System.out.println("365 days after Epoch date->" + fromEpoch);

		// obtain date using zone id
		LocalDate inUS = LocalDate.now(ZoneId.of("America/Chicago"));
		System.out.println("Date in US->" + inUS);

		LocalDate hunderedDay = LocalDate.ofYearDay(2017, 100);
		System.out.println("100th day of 2017->" + hunderedDay);

	}

}
