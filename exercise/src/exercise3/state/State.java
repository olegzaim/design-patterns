package exercise3.state;

public abstract class State {

    protected int level;

    protected State nextState;

    abstract void applyState(Order order);

    public void setNextState(State nextState) {
        this.nextState = nextState;
    }

    public void logState(int level, Order order) {

        if (this.level <= level) {
            applyState(order);
        }
        if (this.nextState != null) {
            this.nextState.logState(level, order);
        }

    }

    @Override
    public String toString() {
        return "State{" +
                " currentState=" + getStateName() +
                ", nextState=" + nextState +
                '}';
    }

    public abstract String getStateName();
}
