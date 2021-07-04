package understanding.collectors;

import understanding.collectors.model.Product;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamPartitionByExample {

    public static void main(String[] args) {

        List<Product> products = Arrays.asList(new Product(23, "potatoes"),
                new Product(14, "orange"), new Product(13, "lemon"),
                new Product(23, "bread"), new Product(13, "sugar"));

        // creates a partition of two lists
        // one list of products which satisfy the given predicate with key as true in map
        // one list of products which do not satisfy the given predicate  with key as false in map
        Map<Boolean, List<Product>> paritionedProducts = products.stream().collect(Collectors.partitioningBy(p -> p.getPrice() > 15));

        paritionedProducts.entrySet().forEach(System.out::println);

    }

}
