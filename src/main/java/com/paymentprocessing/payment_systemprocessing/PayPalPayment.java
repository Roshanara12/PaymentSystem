package com.paymentprocessing.payment_systemprocessing;

public class PayPalPayment extends Payment {

    private String email;

    public PayPalPayment(double amount, String email) {
        super(amount);
        this.email = email;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing PayPal Payment for " + email + " with amount " + getAmount());
    }
}
