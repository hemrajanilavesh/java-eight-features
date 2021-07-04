package understanding.collectors;

import understanding.collectors.model.Developer;
import understanding.collectors.model.Product;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * grouping the elements in the stream based on specified function
 */
public class StreamGroupingByExample {

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(new Product(23, "potatoes"),
                new Product(14, "orange"), new Product(13, "lemon"),
                new Product(23, "bread"), new Product(13, "sugar"));

        // group by price in this example
        Map<Integer, List<Product>> priceToProductMap = products.stream()
                .collect(Collectors.groupingBy(Product::getPrice));

        priceToProductMap.entrySet().forEach(System.out::println);

        List<Developer> developers = getDevelopers();

        // group by skill set and get count of each skill set
        // map of skill set -> count of resources
        Map<String, Long> skillSetToCountMap = developers.stream()
                .collect(Collectors.groupingBy(Developer::getSkillSet, Collectors.counting()));

        skillSetToCountMap.entrySet().forEach(System.out::println);

        // map of skill set -> sum of salaries

        Map<String, Integer> skillSetToSumOfSalaryMap = developers.stream()
                .collect(Collectors.groupingBy(Developer::getSkillSet, Collectors.summingInt(dev -> dev.getSalary().intValue())));
        skillSetToSumOfSalaryMap.entrySet().forEach(System.out::println);

        List<Product> productsContainingDuplicates = Arrays.asList(new Product(23, "potatoes"),
                new Product(14, "orange"), new Product(13, "lemon"),
                new Product(14, "orange"), new Product(13, "lemon"),
                new Product(23, "potatoes"),
                new Product(23, "bread"), new Product(13, "sugar"));

        Map<Product, Long> frequencyOfEachProduct = productsContainingDuplicates.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        frequencyOfEachProduct.entrySet().forEach(System.out::println);


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
