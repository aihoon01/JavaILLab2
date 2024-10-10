package org.labexercise.demo.topDownApproach.stubs;

import org.junit.jupiter.api.Test;
import org.labexercise.demo.topDownApproach.User;
import org.labexercise.demo.topDownApproach.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserServiceStubTest {

    @Autowired
    UserServiceStub userService;

    @Test
    void createUser() {
        User user = userService.createUser("Steph", "steph@gmail.com", "steph11");
        assertNotNull(user);
        assertEquals("Steph", user.getUsername());
    }
}