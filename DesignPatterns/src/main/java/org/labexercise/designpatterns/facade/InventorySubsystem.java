package org.labexercise.designpatterns.facade;

public class InventorySubsystem {
    public boolean checkAvailability(String crypto, double amount) {
        // Simulate checking availability
        System.out.println("Checking availability of " + amount + " " + crypto);
        return true; // Assume the cryptocurrency is always available
    }

    public void reserveCrypto(String crypto, double amount) {
        // Simulate reserving cryptocurrency
        System.out.println("Reserving " + amount + " " + crypto);
    }
}
