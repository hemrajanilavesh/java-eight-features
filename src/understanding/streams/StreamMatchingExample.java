package understanding.streams;

import understanding.collectors.model.Developer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Stream API gives a handy set of instruments to validate elements of a sequence according to some predicate.
 * To do this, one of the following methods can be used: anyMatch(), allMatch(), noneMatch().
 */
public class StreamMatchingExample {

    public static void main(String[] args) {

        List<Developer> developers = getDevelopers();

        // 1. anyMatch(Predicate)

        Predicate<Developer> ageGreaterThanTen = d -> d.getAge() > 10;
        boolean hasDeveloperWithAgeGreaterThanTen = developers.stream()
                .anyMatch(ageGreaterThanTen); // returns true if any developer has age > 10

        System.out.println(hasDeveloperWithAgeGreaterThanTen);

        boolean hasAnyNullObject = Stream.empty().anyMatch(Objects::isNull); // always returns false since no element found which is null since stream is empty
        System.out.println(hasAnyNullObject);

        // 2. allMatch(Predicate)

        Predicate<Developer> hasMinimumWage = developer -> Objects.nonNull(developer.getSalary()) && developer.getSalary().intValue() > 100;
        boolean allDevelopersHaveMinimumWage = developers.stream().allMatch(hasMinimumWage); // returns true if all elements satisfy predicate
        System.out.println(allDevelopersHaveMinimumWage);

        boolean hasAllNullObjects = Stream.empty().allMatch(Objects::nonNull); // always returns true because stream has no element and hence no element violates predicate
        System.out.println(hasAllNullObjects);

        // 3. noneMatch(Predicate)

        Predicate<Developer> hasScalaDeveloper = developer -> Objects.nonNull(developer.getSkillSet()) && developer.getSkillSet().equalsIgnoreCase("Scala");

        boolean isThereAScalaDeveloper = developers.stream().noneMatch(hasScalaDeveloper); // returns true since list has no scala developer
        System.out.println(isThereAScalaDeveloper);

        boolean noNullObjects = Stream.empty().noneMatch(Objects::isNull); // since stream is empty, no match found which violates isnull, hence return true
        System.out.println(noNullObjects);


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
