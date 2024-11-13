package com.paymentprocessing.payment_systemprocessing;

public class CreditCardPayment extends Payment implements MyCard {

    private String cardNumber;

    public CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        validateCard();
        chargeCard();
        System.out.println("Credit Card Payment Processed: " + getAmount());
    }

    @Override
    public void validateCard() {
        System.out.println("Validating credit card " + cardNumber);
    }

    @Override
    public void chargeCard() {
        System.out.println("Charging credit card " + cardNumber + " with amount " + getAmount());
    }
}

