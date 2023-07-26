package sap.springlearning.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sap.springlearning.springboot.dao.UserDAO;
import sap.springlearning.springboot.model.User;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserService {
    private final UserDAO userDAO;

    @Autowired
    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public List<User> getAllUsers() {

        return userDAO.getAllUsers();
    }

    public User getUserById(int id) {
        return userDAO.getUserById(id);
    }

    @Transactional
    public void addUser(User user) {
        userDAO.addUser(user);
    }

    @Transactional
    public void changeUser(User newUser, int id) {
        userDAO.changeUser(newUser, id);
    }

    @Transactional
    public void deleteUserById(int id) {
        userDAO.deleteUserById(id);
    }
}
