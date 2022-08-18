package n1ex1;

import java.util.ArrayList;
import java.util.List;

public class StockAgent implements Observable{
    private List<Observer> observers;
    private int stockPrice;

    public StockAgent() {
        this.observers = new ArrayList<>();
        this.stockPrice = 0;
    }

    @Override
    public void attachObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void notifyAllObservers() {
        this.observers.forEach(Observer::update);
    }

    public void stockPricesUp(){
        stockPrice++;
        notifyAllObservers();
    }

    public void stockPricesDown(){
        stockPrice--;
        notifyAllObservers();
    }

    public int getStockPrice(){
        return this.stockPrice;
    }
}
