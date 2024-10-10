package org.labexercise.designpatterns.facade;

public class UserAccountSubSystem {
    public boolean authenticateUser(String username, String password) {
        // Simulate user authentication
        System.out.println("Authenticating user: " + username);
        return true; // Assume authentication is always successful
    }

    public void getUserDetails(String username) {
        // Retrieve user details
        System.out.println("Fetching details for user: " + username);
    }
}
