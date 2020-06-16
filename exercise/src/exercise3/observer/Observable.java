package exercise3.observer;

import exercise3.state.Order;

public interface Observable {
    void subscribe(Observer observer);
    void notifyObservers(Order order);
    String getUpdate();
}
