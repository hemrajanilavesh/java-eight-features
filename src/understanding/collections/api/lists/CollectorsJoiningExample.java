package understanding.collections.api.lists;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsJoiningExample {
    public static void main(String[] args) {
        List<Product> productList = Arrays.asList(new Product(23, "potatoes"),
                new Product(14, "orange"), new Product(13, "lemon"),
                new Product(23, "bread"), new Product(13, "sugar"));

        String joinedProductNames = productList.stream()
                .map(Product::getName)
                .collect(Collectors.joining(",", "[", "]"));
        System.out.println(joinedProductNames);
    }
}
