package org.labexercise.demo.topDownApproach.interfaces;

import org.labexercise.demo.topDownApproach.User;


public interface UserService {
    User createUser(String name, String email, String password);
    User updateUser(Long userId, String name, String email);
    void deleteUser(Long userId);
    User getUser(Long userId);
}
