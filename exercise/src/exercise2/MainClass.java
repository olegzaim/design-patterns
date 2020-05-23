package exercise2;

import exercise2.factory.ChatFactory;
import exercise2.mediator.User;
import exercise2.mediator.ChatMessageMediator;
import exercise2.mediator.MessageMediator;

public class MainClass {
    public static void main(String[] args) {
        MessageMediator mediator = new ChatMessageMediator();
        ChatFactory chatFactory = new ChatFactory();
        User customerUser1 = chatFactory.createUser(mediator, "Customer", "Ivan");

        customerUser1.send("Hello World");
        customerUser1.send("addBot");

        User customerUser2 = chatFactory.createUser(mediator, "Customer", "Petr");
        customerUser2.send("cat");
        User bot = chatFactory.createUser(mediator, "Bot", "Bot1");
        System.out.println(bot.getName());
    }
}
