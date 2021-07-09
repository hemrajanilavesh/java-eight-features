package understanding.date.time.api;

import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTimeExample {

	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		System.out.println("Current Date->" + now);
		
		LocalTime specificTime = LocalTime.of(10, 10, 10, 10);
		System.out.println("Specific Time->" + specificTime);
		
		LocalTime time_using_zone = LocalTime.now(ZoneId.of("America/Chicago"));
		System.out.println("Time using zone->" + time_using_zone);

		LocalTime specificSecondTime = LocalTime.ofSecondOfDay(10000);
		System.out.println("LocalTime which is 10000 seconds away from start of the day -> " +  specificSecondTime);

	}

}
