package exercise3.state;

public class NewOrderState extends State {

    NewOrderState() {
        this.level = StatusesEnum.Statuses.NEW_ORDER.getValue();

    }

    @Override
    public void applyState(Order order) {
        order.setOrderState(this);
    }

    @Override
    public String getStateName() {
        String stateName = StatusesEnum.Statuses.NEW_ORDER.getName();
        return stateName;
    }
}
