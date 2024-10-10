package org.labexercise.designpatterns.facade;

public class CryptoShopFacade {

    private UserAccountSubSystem userAccountSubsystem;
    private PaymentSubSystem paymentSubsystem;
    private InventorySubsystem inventorySubsystem;
    private OrderFulfillmentSubsystem orderFulfillmentSubsystem;

    public CryptoShopFacade(UserAccountSubSystem userAccountSubsystem, PaymentSubSystem paymentSubsystem, InventorySubsystem inventorySubsystem, OrderFulfillmentSubsystem orderFulfillmentSubsystem) {
        this.userAccountSubsystem = userAccountSubsystem;
        this.paymentSubsystem = paymentSubsystem;
        this.inventorySubsystem = inventorySubsystem;
        this.orderFulfillmentSubsystem = orderFulfillmentSubsystem;
    }




    public void placeOrder(String username, String password, String crypto, double amount, double paymentAmount) {
        // Step 1: Authenticate User
        if (userAccountSubsystem.authenticateUser(username, password)) {
            // Step 2: Check Inventory
            if (inventorySubsystem.checkAvailability(crypto, amount)) {
                // Step 3: Process Payment
                if (paymentSubsystem.processPayment(username, paymentAmount)) {
                    // Step 4: Reserve Cryptocurrency
                    inventorySubsystem.reserveCrypto(crypto, amount);
                    // Step 5: Fulfill Order
                    String orderId = "ORD" + System.currentTimeMillis(); // Generate a dummy order ID
                    orderFulfillmentSubsystem.fulfillOrder(orderId);
                    System.out.println("Order placed successfully with Order ID: " + orderId);
                } else {
                    System.out.println("Payment failed for user: " + username);
                }
            } else {
                System.out.println(crypto + " is not available.");
            }
        } else {
            System.out.println("Authentication failed for user: " + username);
        }
    }

    public void getUserDetails(String username) {
        userAccountSubsystem.getUserDetails(username);
    }
}
