package exercise3.destinations;

import exercise3.state.Order;
import exercise3.observer.Observable;

public abstract class DestinationDesk implements Observable {
    private String name;

    public void newOrder(Order newOrder) {
        newOrder.getOrderState()
                .logState(2, newOrder);
        System.out.println(getName()+ " Order status changed! " + newOrder.toString());
        notifyObservers(newOrder);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
