package sap.springlearning.springboot.services;

import org.springframework.transaction.annotation.Transactional;
import sap.springlearning.springboot.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(int id);

    @Transactional
    void addUser(User user);

    @Transactional
    void changeUser(User newUser, int id);

    @Transactional
    void deleteUserById(int id);
}
