package ru.mirea.lab6;

public class Animal implements Nameable {
    private final String name;
    public Animal(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return "Животное: " + name;
    }
}
