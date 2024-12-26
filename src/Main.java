public class Main {
    public static void main(String[] args) {
        try {
            Product product1 = new Product("Квас", 55.0);
            Product product2 = new Product("Сухарики", 23.0);

            Store store1 = new Store("ATB");
            store1.addProduct(product1, 10.0);
            store1.addProduct(product2, -5.0); // Кинеться BusinessRuleViolationException

        } catch (BusinessRuleViolationException e) {
            System.err.println("Помилка бізнес-правил: " + e.getMessage());
        } catch (IllegalArgumentException | NullPointerException e) {
            System.err.println("Помилка введення: " + e.getMessage());
        } finally {
            System.out.println("Завершення обробки магазину.");
        }

        // Інша частина програми
        Product product3 = new Product("Молоко", 30.0);
        Store store2 = new Store("Eco-market");
        try {
            store2.addProduct(null, 25.0); // Кинеться NullPointerException
        } catch (Exception e) {
            System.err.println("Виключення: " + e.getMessage());
        }
    }
}