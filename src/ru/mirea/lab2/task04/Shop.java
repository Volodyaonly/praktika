package ru.mirea.lab2.task04;

import java.util.ArrayList;

public class Shop {
    private final ArrayList<Computer> computers = new ArrayList<>();
    public void addComputer(Computer computer) {
        computers.add(computer);
    }
    public void removeByBrand(String brand) {
        computers.removeIf(computer -> computer.getBrand().equalsIgnoreCase(brand));
    }
    public Computer findByBrand(String brand) {
        for (Computer computer : computers)
            if (computer.getBrand().equalsIgnoreCase(brand)) return computer;
        return null;
    }
    public void printAll() {
        if (computers.isEmpty()) System.out.println("Магазин пуст");
        else for (Computer computer : computers) System.out.println(computer);
    }
}
