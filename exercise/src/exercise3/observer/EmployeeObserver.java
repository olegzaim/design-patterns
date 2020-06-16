package exercise3.observer;

import exercise3.state.Order;
import exercise3.state.InStorageOrderState;
import exercise3.state.ProcessingOrderState;
import exercise3.state.State;
import exercise3.state.StatusesEnum;

public class EmployeeObserver implements Observer {

    private static final String PROCESSING = StatusesEnum.Statuses.PROCESSING.getName();

    private Observable topic;


    @Override
    public void update(Order order) {
        if (order == null) {
            System.out.println("No order");
            return;
        }
        State state = order.getOrderState();
        if (state.getStateName() != null && state.getStateName()
                .equals(PROCESSING)) {
            state.logState(3, order);

        }
        System.out.println("Order status changed! " + order.toString());

    }

    @Override
    public void setTopic(Observable topic) {
        this.topic = topic;
    }

}
