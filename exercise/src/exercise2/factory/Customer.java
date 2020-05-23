package exercise2.factory;

import exercise2.mediator.MessageMediator;
import exercise2.mediator.User;

public class Customer extends User {
    private final String ADD_BOT_COMMAND = "addBot";

    public Customer(MessageMediator med, String name) {
        super(med, name);
        mediator.addUser(this);
    }

    @Override
    public void send(String message) {
        System.out.println(this.name + " sends: " + message);
        mediator.sendMessage(message, this);
        if (message.equals(ADD_BOT_COMMAND)) {
            ChatFactory chatFactory = new ChatFactory();
            chatFactory.createUser(mediator, "Bot", "Bot");
        }
    }

    @Override
    public void receive(String message, String senderName) {
        System.out.println(this.name + " receives: " + message);
    }
}
