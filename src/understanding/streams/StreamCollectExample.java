package understanding.streams;

import understanding.collectors.model.Product;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Reduction of a stream using collect() method
 * It accepts an argument of the type Collector, which specifies the mechanism of reduction.
 */

public class StreamCollectExample {

    public static void main(String[] args) {
        
        List<Product> productList = Arrays.asList(new Product(23, "potatoes"),
                new Product(14, "orange"), new Product(13, "lemon"),
                new Product(23, "bread"), new Product(13, "sugar"));

        List<String> productNames = productList.stream()
                .map(Product::getName)
                .collect(Collectors.toList()); // or Collectors.toSet()
        System.out.println(productNames);

        String commaSeparatedProductNames = productList.stream()
                .map(Product::getName)
                .collect(Collectors.joining(", ", "[", "]"));
        System.out.println(commaSeparatedProductNames);

        // collecting statistical information from stream

        Integer sumOfAllProducts = productList.stream().collect(Collectors.summingInt(Product::getPrice));
        System.out.println(sumOfAllProducts);

        Double avgOfAllProducts = productList.stream().collect(Collectors.averagingInt(Product::getPrice));
        System.out.println(avgOfAllProducts);

        


    }

}
