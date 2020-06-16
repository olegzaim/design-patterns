package exercise3.observer;

import exercise3.state.Order;

public interface Observer {
    void update(Order order);
    void setTopic(Observable topic);
}
