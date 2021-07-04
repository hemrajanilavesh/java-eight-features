package understanding.functional.interfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Consumer.html
 *
 * As opposed to Supplier, the Consumer takes one argument and returns nothing. It represents an action.
 *
 */
public class ConsumerExample {

    public static void main(String[] args) {

        // the forEach takes a Consumer as argument

        Map<String, Integer> ages = new HashMap<>();
        ages.put("John", 25);
        ages.put("Freddy", 24);
        ages.put("Samuel", 30);

        BiConsumer<String, Integer> printAfterConcat = (name, age) -> System.out.println("Person with name: " + name + " is " + age + " years old.");

        ages.forEach(printAfterConcat);

    }

}
