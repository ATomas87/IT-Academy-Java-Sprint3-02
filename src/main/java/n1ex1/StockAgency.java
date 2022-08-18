package n1ex1;

public class StockAgency implements Observer {

    private StockAgent stockAgent;

    public StockAgency(StockAgent stockAgent) {
        this.stockAgent = stockAgent;
    }

    @Override
    public void update() {
        System.out.println("La bolsa ha cambiado. El nuevo precio de las acciones es: " + stockAgent.getStockPrice());
    }
}
