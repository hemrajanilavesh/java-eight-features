package understanding.functional.interfaces;

import understanding.collectors.model.Developer;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

/**
 * https://docs.oracle.com/javase/8/docs/api/java/util/function/BinaryOperator.html
 *
 * Its a special case BiFunction. It takes two operands and an operation e.g. a + b and returns result c.
 * Here operands and result are of the same type.
 *
 */
public class BinaryOperatorExample {

    public static void main(String[] args) {
        List<Developer> developers = getDevelopers();

        // get developer with max salary
        // Note that Collectors.maxBy internally uses BinaryOperator.maxBy static method
        Comparator<Developer> salaryComparator = Comparator.comparing(Developer::getSalary);
        Optional<Developer> developerWithHighestSalary = developers.stream()
                                                                    .filter(Objects::nonNull)
                                                                    .collect(Collectors.maxBy(salaryComparator));
        developerWithHighestSalary.ifPresent(System.out::println);

        // get developer with minimum salary
        // Note that Collectors.minBy internally uses BinaryOperator.minBy static method
        Optional<Developer> developerWithLeastSalary = developers.stream()
                                                                .filter(Objects::nonNull)
                                                                .collect(Collectors.minBy(salaryComparator));

        developerWithLeastSalary.ifPresent(System.out::println);


    }

    public static List<Developer> getDevelopers() {

        List<Developer> result = new ArrayList<>();

        result.add(new Developer("mkyong", new BigDecimal("70000"), 33, "Java"));
        result.add(new Developer("alvin", new BigDecimal("80000"), 20, "UI"));
        result.add(new Developer("mkyong", new BigDecimal("100000"), 10, "SQL"));
        result.add(new Developer("iris", new BigDecimal("170000"), 55, "Java"));
        result.add(new Developer("alvin-ui", new BigDecimal("80000"), 20, "UI"));
        result.add(new Developer("mkyong-SQL", new BigDecimal("100000"), 10, "SQL"));
        result.add(new Developer("iris-java", new BigDecimal("170000"), 55, "Java"));

        return result;

    }


}
