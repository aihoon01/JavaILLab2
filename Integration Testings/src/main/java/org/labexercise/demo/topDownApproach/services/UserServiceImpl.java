package org.labexercise.demo.topDownApproach.services;

import org.labexercise.demo.topDownApproach.User;
import org.labexercise.demo.topDownApproach.interfaces.UserService;
import org.labexercise.demo.topDownApproach.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(String name, String email, String password) {
        User user = new User(name, email, password);
        User user1 = this.saveUser(user);
        return user1;
    }

    @Override
    public User updateUser(Long userId, String name, String email) {
        return null;
    }

    @Override
    public void deleteUser(Long userId) {

    }

    @Override
    public User getUser(Long userId) {
        return null;
    }


    private User saveUser (User user) {
        return userRepository.save(user);
    }
}
