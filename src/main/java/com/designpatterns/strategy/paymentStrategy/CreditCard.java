package com.designpatterns.strategy.paymentStrategy;

public class CreditCard {
    private int amount;
    private String number;
    private String date;
    private String code;

    CreditCard(String number, String date, String code) {
        this.amount = 100000;
        this.number = number;
        this.date = date;
        this.code = code;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
