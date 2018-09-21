package com.designpatterns.strategy.paymentStrategy;

public interface PaymentStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
