package ru.mirea.lab6;

import ru.mirea.common.Printable;

public class ShopP implements Printable {
    private final String name;
    public ShopP(String name) {
        this.name = name;
    }
    @Override
    public void print() {
        System.out.println("Магазин: " + name);
    }
}
