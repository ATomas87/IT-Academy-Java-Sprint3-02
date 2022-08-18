package n1ex1;

public interface Observable {
    void attachObserver(Observer observer);
    void notifyAllObservers();
}
