package exercise3.state;

public class Order {
    String destination;
    String customerName;
    String address;
    State orderState;

    public Order(String destination, String customerName, String address) {
        this.destination = destination;
        this.customerName = customerName;
        this.address = address;
        State orderStateChain = getChain();
        orderStateChain.applyState(this);
        System.out.println("New order! " + toString());
    }

    public State getChain() {
        State newOrderState = new NewOrderState();
        State processingOrderState = new ProcessingOrderState();
        State inStorageOrderState = new InStorageOrderState();

        newOrderState.setNextState(processingOrderState);
        processingOrderState.setNextState(inStorageOrderState);

        return newOrderState;

    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public State getOrderState() {
        return orderState;
    }

    public void setOrderState(State orderState) {
        this.orderState = orderState;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Order{" +
                "destination='" + destination + '\'' +
                ", customerName='" + customerName + '\'' +
                ", address='" + address + '\'' +
                ", orderState=" + orderState +
                '}';
    }
}
