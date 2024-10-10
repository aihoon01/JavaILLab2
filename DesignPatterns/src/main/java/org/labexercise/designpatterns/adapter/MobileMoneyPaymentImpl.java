package org.labexercise.designpatterns.adapter;

public class MobileMoneyPaymentImpl implements MobileMoneyPayment {
    @Override
    public void payThroughMobileMoney(double amount) {
        System.out.println("Payment of $" + amount + " made through Mobile Money.");
    }
}
