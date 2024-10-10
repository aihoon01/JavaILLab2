package org.labexercise.demo.topDownApproach.services;

import org.junit.jupiter.api.Test;
import org.labexercise.demo.topDownApproach.User;
import org.labexercise.demo.topDownApproach.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceImplTest {

    @Autowired
    UserServiceImpl userService;

    @Test
    void shouldCreateUser() {
        User user = userService.createUser("Stephen", "stephen@gmail.com", "stephen11");
        assertNotNull(user);
        assertEquals("Stephen", user.getUsername());
    }
}