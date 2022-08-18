package n3ex1;

import java.util.ArrayList;
import java.util.List;

public class ProductLister {

    private List<Product> products;
    private ExchangeConverter exchangeConverter;

    public ProductLister(ExchangeConverter exchangeConverter) {
        this.products = new ArrayList<>();
        this.exchangeConverter = exchangeConverter;
    }

    public void addProduct(Product product){
        this.products.add(product);
    }

    public void listProducts() {
        for (Product product : products) {
            System.out.println(product.getName() + " prize is " + exchangeConverter.convert(product.getPrize()) + " " + exchangeConverter.getCurrency());
        }
    }

    public void setCurrency(String currency) {
        this.exchangeConverter.setCurrency(currency);
    }
}
