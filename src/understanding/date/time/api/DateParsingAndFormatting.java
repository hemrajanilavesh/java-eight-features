package understanding.date.time.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateParsingAndFormatting {

	public static void main(String[] args) {

		LocalDate today = LocalDate.of(2019,10,27);
		System.out.println("Default Format of LocalDate->" + today);

		System.out.println("Change LocalDate to specific format ->" + today.format(DateTimeFormatter.ofPattern("d-MMM-uuuu")));

		System.out.println("Change LocalDate to specific format ->" + today.format(DateTimeFormatter.ofPattern("d/M/uuuu")));

		System.out.println("Basic ISO Date Format -> " + today.format(DateTimeFormatter.BASIC_ISO_DATE));

		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("Default Format of LocalDateTime->" + dateTime);

		System.out.println("Change LocalDateTime to specific format ->" + dateTime.format(DateTimeFormatter.ofPattern("d-MMM-uuuu:HH:mm:ss")));

	}

}
