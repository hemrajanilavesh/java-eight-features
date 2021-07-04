package understanding.functional.interfaces;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

/**
 *  https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Predicate.html
 *
 *  Represents a unary Function which takes an argument and returns Boolean.
 *  Returns True if argument satisfies the predicate, else returns False.
 *
 *  Used in filtering streams.
 *
 */
public class PredicateExample {

    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1, 50);

        //Predicate<Integer> isDivisibleByThree = i -> i % 3 == 0;
        IntPredicate isDivisibleByThree = i -> i % 3 == 0;

        // prints only those integers which are divisible by 3
        intStream.filter(isDivisibleByThree).forEach(System.out::println);

    }

}
