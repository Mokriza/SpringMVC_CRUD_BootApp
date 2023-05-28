package ru.katalearning.SpringMVC_CRUD_BootApp.service;

import ru.katalearning.SpringMVC_CRUD_BootApp.model.User;

import java.util.List;

public interface UserService {

    User getUser(Long id);

    List<User> getAllUsers();

    void createUser(User user);

    void updateUser(Long id, User user);

    void deleteUser(Long id);
}
