package ru.mirea.lab2.task04;

public class Shop {
    private Computer[] computers = new Computer[10];
    private int count = 0;

    public void addComputer(Computer computer) {
        if (count == computers.length) {
            Computer[] bigger = new Computer[computers.length * 2];
            for (int i = 0; i < count; i++) {
                bigger[i] = computers[i];
            }
            computers = bigger;
        }
        computers[count] = computer;
        count++;
    }

    public void removeByBrand(String brand) {
        for (int i = 0; i < count; i++) {
            if (computers[i].getBrand().equalsIgnoreCase(brand)) {
                for (int j = i; j < count - 1; j++) {
                    computers[j] = computers[j + 1];
                }
                count--;
                computers[count] = null;
                i--;
            }
        }
    }

    public Computer findByBrand(String brand) {
        for (int i = 0; i < count; i++) {
            if (computers[i].getBrand().equalsIgnoreCase(brand)) {
                return computers[i];
            }
        }
        return null;
    }

    public void printAll() {
        if (count == 0) {
            System.out.println("Магазин пуст");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println(computers[i]);
            }
        }
    }
}
