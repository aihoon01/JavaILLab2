package org.labexercise.demo.topDownApproach.stubs;

import org.labexercise.demo.topDownApproach.User;
import org.labexercise.demo.topDownApproach.interfaces.UserService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceStub implements UserService {
    private Map<Long, User> userDatabase = new HashMap<>();
    private long currentId = 1;

    @Override
    public User createUser(String name, String email, String password) {
        User user = new User("Steph", "steph@gmail.com", "steph11");
        userDatabase.put(user.getId(), user);
        return user;
    }

    @Override
    public User updateUser(Long userId, String name, String email) {
        User user = userDatabase.get(userId);
        if (user != null) {
            user.setUsername(name);
            user.setEmail(email);
        }
        return user;
    }

    @Override
    public void deleteUser(Long userId) {
        userDatabase.remove(userId);
    }

    @Override
    public User getUser(Long userId) {
        return userDatabase.get(userId);
    }

}
