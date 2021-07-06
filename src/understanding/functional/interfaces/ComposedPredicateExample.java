package understanding.functional.interfaces;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *  https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Predicate.html
 *  A composed predicate is used to evaluate a combination of multiple predicates on an argument.
 *  e.g. test integer greater than 10 and less than 20
 *
 **/
public class ComposedPredicateExample {

    public static void main(String[] args) {

        // get integers which are even and greater than 10
        Predicate<Integer> isEven = i -> i % 2 == 0;
        Predicate<Integer> isGreaterThanTen = i -> i > 10;
        List<Integer> evenIntegersGreaterThanTen = IntStream.range(1, 50)
                .filter(i -> isEven.and(isGreaterThanTen).test(i))
                .mapToObj(Integer::new)
                .collect(Collectors.toList());
        System.out.println(evenIntegersGreaterThanTen);

        // get integers which are even or divisible by 5
        Predicate<Integer> isDivisibleByFive = i -> i % 5 == 0;
        List<Integer> evenODivisibleByFive = IntStream.range(1, 50)
                .filter(i -> isEven.or(isDivisibleByFive).test(i))
                .mapToObj(Integer::new)
                .collect(Collectors.toList());
        System.out.println(evenODivisibleByFive);

        // get all the odd numbers by using negate on even predicate
        List<Integer> oddNumbers = IntStream.range(1, 50)
                .filter(i -> isEven.negate().test(i))
                .mapToObj(Integer::new)
                .collect(Collectors.toList());
        System.out.println(oddNumbers);

    }

}
