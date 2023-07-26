package sap.springlearning.springboot.dao;

import sap.springlearning.springboot.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();

    User getUserById(int id);

    void addUser(User user);

    void changeUser(User newUser, int id);

    void deleteUserById(int id);
}
