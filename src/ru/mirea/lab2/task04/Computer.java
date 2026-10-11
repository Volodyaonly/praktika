package ru.mirea.lab2.task04;

public class Computer {
    private final String cpu;
    private final int ram;
    private final int storage;
    private final String brand;
    public Computer(String cpu, int ram, int storage, String brand) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
    @Override
    public String toString() {
        return "Computer{cpu='" + cpu + "', ram=" + ram + "GB, storage=" + storage + "GB, brand='" + brand + "'}";
    }
}
