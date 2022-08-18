package n3ex1;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Watermelon", 9);
        Product p2 = new Product("Coffee", 1.2);
        Product p3 = new Product("Nintendo Switch", 300);

        ExchangeConverter exchangeConverter = new ExchangeConverter("USD");
        ProductLister productLister = new ProductLister(exchangeConverter);
        productLister.addProduct(p1);
        productLister.addProduct(p2);
        productLister.addProduct(p3);
        productLister.listProducts();

        exchangeConverter.setCurrency("GBP");
        productLister.listProducts();

        exchangeConverter.setCurrency("EUR");
        productLister.listProducts();

    }
}
