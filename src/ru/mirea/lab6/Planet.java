package ru.mirea.lab6;

public class Planet implements Nameable {
    private final String name;
    public Planet(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return "Планета: " + name;
    }
}
