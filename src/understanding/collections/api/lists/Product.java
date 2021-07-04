package understanding.collections.api.lists;

public class Product {
    Integer price;
    String name;

    public Product(Integer price, String name) {
        this.price = price;
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
