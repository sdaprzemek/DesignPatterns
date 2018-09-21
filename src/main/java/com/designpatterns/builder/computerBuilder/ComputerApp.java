package com.designpatterns.builder.computerBuilder;

public class ComputerApp {
    public static void main(String[] args) {
        Computer computer = new Computer
                .ComputerBuilder("1000GB", "8GB", "2500GHz")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .setLCDEnabled(false).build();

        System.out.println(computer);
    }
}
