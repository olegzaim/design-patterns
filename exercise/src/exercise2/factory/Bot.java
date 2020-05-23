package exercise2.factory;

import exercise2.mediator.MessageMediator;
import exercise2.mediator.User;

public class Bot extends User {

    private static Bot singletonBot;

    private Bot(MessageMediator med, String name) {
        super(med, name);
        mediator.addUser(this);
    }

    public static Bot getSingletonBot(MessageMediator med, String name) {
        if (singletonBot == null) {
            singletonBot = new Bot(med, name);
        }
        return singletonBot;
    }

    @Override
    public void send(String message) {
        System.out.println(this.name + " sends: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message, String senderName) {
        System.out.println(this.name + " receives: " + message);
        if (message.equals("cat")) {
            mediator.removeUser(senderName);
            send(" User with name '" + senderName + "' was kicked from the room, 'cat' is a forbidden word in this chat!");
        }
    }
}
