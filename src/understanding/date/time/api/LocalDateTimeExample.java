package understanding.date.time.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class LocalDateTimeExample {

	public static void main(String[] args) {
		
		LocalDateTime today = LocalDateTime.now();
		System.out.println("Current DateTime->" + today);
		
		// current date time using date and time
		today = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		System.out.println("Current DateTime->" + today);
		
		// local date time using zone
		LocalDateTime using_time_zone = LocalDateTime.now(ZoneId.of("America/Chicago"));
		System.out.println("DateTime using time zone->" + using_time_zone);
		
		// creating specific date time
		LocalDateTime specificDate = LocalDateTime.of(2018, 12, 25, 17, 50, 1);
		System.out.println("DateTime using specific values->" + specificDate);
		
	}

}
