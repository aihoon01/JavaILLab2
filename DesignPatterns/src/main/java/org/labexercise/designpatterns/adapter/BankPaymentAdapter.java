package org.labexercise.designpatterns.adapter;

public class BankPaymentAdapter implements MobileMoneyPayment{

    private BankPayment bankPayment;

    public BankPaymentAdapter(BankPayment bankPayment) {
        this.bankPayment = bankPayment;
    }

    @Override
    public void payThroughMobileMoney(double amount) {
        bankPayment.payThroughBank(amount);
    }
}
