package exercise2.factory;

import exercise2.mediator.MessageMediator;
import exercise2.mediator.User;

public class ChatFactory {
    private static final String CREATE_BOT_COMMAND = "Bot";
    private static final String CREAT_CUSTOMER_COMMAND = "Customer";

    public User createUser(MessageMediator mediator, String userType, String userName) {
        User user = null;
        switch (userType) {
            case CREATE_BOT_COMMAND:
                user = Bot.getSingletonBot(mediator, userType);
                user.setName(userName);
                user.setUserType(userType);
                break;
            case CREAT_CUSTOMER_COMMAND:
                user = new Customer(mediator, userType);
                user.setName(userName);
                user.setUserType(userType);
                break;
            default:
                break;

        }

        return user;

    }

}
