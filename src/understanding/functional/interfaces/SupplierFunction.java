package understanding.functional.interfaces;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

/**
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html
 *
 * It takes no arguments and returns a result.
 *
 */

public class SupplierFunction {

    public static void main(String[] args) throws InterruptedException {

        // suppliers are used for generation of result without passing any input

        // Below supplier shows getting current date time in formatted way

        final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        Supplier<String> formattedDateTimeNow = () -> dateTimeFormatter.format(LocalDateTime.now());

        System.out.println(formattedDateTimeNow.get());  // supplies a value

        Thread.sleep(5000);

        System.out.println(formattedDateTimeNow.get());  // supplies a different value on each invocation
    }

}
