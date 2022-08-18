package n1ex1;

public class Main {
    public static void main(String[] args) {
        StockAgent stockAgent = new StockAgent();

        StockAgency agency1 = new StockAgency(stockAgent);
        StockAgency agency2 = new StockAgency(stockAgent);

        stockAgent.attachObserver(agency1);
        stockAgent.attachObserver(agency2);

        stockAgent.stockPricesUp();
        stockAgent.stockPricesUp();
        stockAgent.stockPricesUp();
        stockAgent.stockPricesUp();
        stockAgent.stockPricesDown();
        stockAgent.stockPricesDown();

    }
}
