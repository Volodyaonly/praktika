package ru.mirea.lab6;

import ru.mirea.common.Printable;

public class BookP implements Printable, Priceable {
    private final String title;
    private final double price;
    public BookP(String title, double price) {
        this.title = title;
        this.price = price;
    }
    @Override
    public void print() {
        System.out.println("Книга: " + title + " (цена " + price + ")");
    }
    @Override
    public double getPrice() {
        return price;
    }
    public static void printBooks(Printable[] printables) {
        for (Printable item : printables) {
            if (item instanceof BookP) item.print();
        }
    }
}
