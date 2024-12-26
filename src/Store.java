import java.util.*;
class Store {
    private String name;
    private Map<Product, Double> productPrices;

    public Store(String name) {
        this.name = name;
        this.productPrices = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void addProduct(Product product, double price) {
        productPrices.put(product, price);
    }

    public Map<Product, Double> getProductPrices() {
        return productPrices;
    }

    public Double getPriceForProduct(String productName) {
        for (Map.Entry<Product, Double> entry : productPrices.entrySet()) {
            if (entry.getKey().getName().equals(productName)) {
                return entry.getValue();
            }
        }
        return null;
    }
}