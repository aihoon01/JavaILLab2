package org.labexercise.designpatterns.facade;

public class PaymentSubSystem {

    public boolean processPayment(String userId, double amount) {
        // Simulate payment processing
        System.out.println("Processing payment of $" + amount + " for user: " + userId);
        return true; // Assume payment is always successful
    }
}
