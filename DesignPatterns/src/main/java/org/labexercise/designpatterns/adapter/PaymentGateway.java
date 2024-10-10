package org.labexercise.designpatterns.adapter;

public class PaymentGateway {

    public static void main(String[] args) {
        //Legacy Payment System
        BankPayment bankPayment = new BankPaymentImpl();

        //Adapter to make it Compatible with modern payment System
        MobileMoneyPayment bankPaymentAdapter = new BankPaymentAdapter(bankPayment);

        //Using the legacy System as if ti were a modern one
        System.out.println("Paying with the Bank Payment Adapter!");
        System.out.println("...");
        bankPaymentAdapter.payThroughMobileMoney(100.00);

        System.out.println();

        MobileMoneyPayment directMobileMoneyPayment = new MobileMoneyPaymentImpl();
        System.out.println("Paying with the Direct Mobile Money Payment!");
        System.out.println("...");
        directMobileMoneyPayment.payThroughMobileMoney(200.00);
    }
}
