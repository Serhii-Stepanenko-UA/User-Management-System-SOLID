package app;

import java.util.List;

// Інтерфейс для роботи з користувачами
interface UserRepository {
    void addUser(User user);

    void removeUser(User user);

    User getUser(String email);

    List<User> getUsers();
}
