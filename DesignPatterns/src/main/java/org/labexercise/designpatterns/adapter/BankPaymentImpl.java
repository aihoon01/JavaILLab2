package org.labexercise.designpatterns.adapter;

public class BankPaymentImpl implements BankPayment {
    @Override
    public void payThroughBank(double amount) {
        System.out.println("Payment of $" + amount + " made through bank.");
    }
}
