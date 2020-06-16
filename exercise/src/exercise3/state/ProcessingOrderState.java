package exercise3.state;

public class ProcessingOrderState extends State {

    ProcessingOrderState() {
        this.level = StatusesEnum.Statuses.PROCESSING.getValue();
    }

    @Override
    public void applyState(Order order) {
        order.setOrderState(this);
    }

    @Override
    public String getStateName() {
        String stateName = StatusesEnum.Statuses.PROCESSING.getName();
        return stateName;
    }
}
