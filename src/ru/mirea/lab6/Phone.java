package ru.mirea.lab6;

public class Phone implements Priceable {
    private final String model;
    private final double price;
    public Phone(String model, double price) {
        this.model = model;
        this.price = price;
    }
    @Override
    public double getPrice() {
        return price;
    }
}
