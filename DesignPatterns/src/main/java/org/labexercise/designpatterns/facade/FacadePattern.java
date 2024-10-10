package org.labexercise.designpatterns.facade;

public class FacadePattern {
        public static void main(String[] args) {

             UserAccountSubSystem userAccountSubsystem = new UserAccountSubSystem();
             PaymentSubSystem paymentSubsystem = new PaymentSubSystem();
             InventorySubsystem inventorySubsystem = new InventorySubsystem();
             OrderFulfillmentSubsystem orderFulfillmentSubsystem = new OrderFulfillmentSubsystem();
            // Create the facade
            CryptoShopFacade cryptoShop = new CryptoShopFacade(
                    userAccountSubsystem,
                    paymentSubsystem,
                    inventorySubsystem,
                    orderFulfillmentSubsystem
            );

            // Place an order through the facade
            cryptoShop.placeOrder("john_doe", "password123", "Bitcoin", 0.5, 15000.0);

            // Fetch user details
            cryptoShop.getUserDetails("john_doe");
        }
}

