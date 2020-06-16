package exercise3.state;

public class InStorageOrderState extends State {
    InStorageOrderState(){
        this.level = StatusesEnum.Statuses.IN_STORAGE.getValue();
    }

    @Override
    public void applyState(Order order) {
        order.setOrderState(this);
    }

    @Override
    public String getStateName() {
        String stateName = StatusesEnum.Statuses.IN_STORAGE.getName();
        return stateName;
    }
}
