package n3ex1;

public class ExchangeConverter {
    private String currency;

    public ExchangeConverter(String currency) {
        this.currency = currency.toLowerCase();
    }

    public void setCurrency(String currency) {
        this.currency = currency.toLowerCase();
    }

    public String getCurrency() {
        return this.currency.toUpperCase();
    }

    public double convert(double prize){
        double prizeConverted = 0;
        switch (this.currency){
            case "usd":
                prizeConverted = prize * 1.01;
                break;
            case "eur":
                prizeConverted = prize;
                break;
            case "jpy":
                prizeConverted = prize * 137.28;
                break;
            case "gbp":
                prizeConverted = prize * 0.84;
                break;
            default:
                System.out.println("Incorrect currency");
                break;
        }
        return prizeConverted;
    }

}
