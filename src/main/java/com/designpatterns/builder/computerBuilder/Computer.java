package com.designpatterns.builder.computerBuilder;

public class Computer {

    private String HDD;
    private String RAM;
    private String CPU;

    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;
    private boolean isLCDEnabled;

    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public String getCPU() {
        return CPU;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    public boolean isLCDEnabled() {
        return isLCDEnabled;
    }

    private Computer(ComputerBuilder builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.CPU = builder.CPU;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
        this.isLCDEnabled = builder.isLCDEnabled;
    }

    public static class ComputerBuilder {

        private String HDD;
        private String RAM;
        private String CPU;

        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;
        private boolean isLCDEnabled;

        public ComputerBuilder(String HDD, String RAM, String CPU) {
            this.HDD = HDD;
            this.RAM = RAM;
            this.CPU = CPU;
        }

        public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public ComputerBuilder setLCDEnabled(boolean isLCDEnabled) {
            this.isLCDEnabled = isLCDEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "HDD='" + HDD + '\'' +
                ", RAM='" + RAM + '\'' +
                ", CPU='" + CPU + '\'' +
                ", isGraphicsCardEnabled=" + isGraphicsCardEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                ", isLCDEnabled=" + isLCDEnabled +
                '}';
    }
}
