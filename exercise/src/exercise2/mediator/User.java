package exercise2.mediator;

import exercise2.mediator.MessageMediator;

public abstract class User {
    public String userType;
    protected String name;
    protected MessageMediator mediator;

    public User(MessageMediator med, String name) {
        this.mediator = med;
        this.name = name;
    }

    public abstract void send(String message);

    public abstract void receive(String message, String senderName);

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
