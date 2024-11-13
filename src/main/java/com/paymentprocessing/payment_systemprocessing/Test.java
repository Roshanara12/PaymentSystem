package com.paymentprocessing.payment_systemprocessing;

public class Test {
    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCardPayment(150.0, "1234-5678-9876-5432");
        creditCardPayment.processPayment();

        Payment payPalPayment = new PayPalPayment(200.0, "user@example.com");
        payPalPayment.processPayment();
    }
}
