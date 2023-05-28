package ru.katalearning.SpringMVC_CRUD_BootApp.dao;

import ru.katalearning.SpringMVC_CRUD_BootApp.model.User;

import java.util.List;

public interface UserDao {
    User getUser(Long id);

    List<User> getAllUsers();

    void createUser(User user);

    void updateUser(Long id, User user);

    void deleteUser(Long id);
}
