package exercise3.destinations;

import exercise3.state.Order;
import exercise3.observer.Observer;

public class PlovdivDestinationDesk extends DestinationDesk {

    private Observer observer;
    private String name = this.getClass()
            .getSimpleName();

    @Override
    public void subscribe(Observer observer) {
        this.observer = observer;
        observer.setTopic(this);
    }


    @Override
    public void notifyObservers(Order order) {
        observer.update(order);
    }

    @Override
    public String getUpdate() {
        return this.name;
    }

    @Override
    public String getName() {
        return "$"+this.name+"$";
    }
}
