package com.designpatterns.decorator.VendingMachine;

public class ToppingDecorator implements HotDrink {

    private HotDrink hotDrink;

    public ToppingDecorator(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    public void prepare() {
        hotDrink.prepare();
        System.out.println("Adding topping ...");
    }
}
