package n3ex1;

public class Product {
    private String name;
    private double prize;

    public Product(String name, double prize) {
        this.name = name;
        this.prize = prize;
    }

    public String getName() {
        return name;
    }

    public double getPrize() {
        return prize;
    }
}
