package exercise2.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMessageMediator implements MessageMediator {
    private List<User> users;

    public ChatMessageMediator() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User usr : users) {
            if (usr != user) {
                usr.receive(message, user.name);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void removeUser(String userName) {
        User userToRemove = this.users.stream()
                .filter(user -> userName.equals(user.name))
                .findFirst()
                .get();
        users.remove(userToRemove);
    }
}
