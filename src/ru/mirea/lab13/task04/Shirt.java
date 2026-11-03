package ru.mirea.lab13.task04;

public class Shirt {
    private String id;
    private String title;
    private String color;
    private String size;

    public Shirt(String text) {
        String[] parts = text.split(",");
        id = parts[0];
        title = parts[1];
        color = parts[2];
        size = parts[3];
    }

    @Override
    public String toString() {
        return "Артикул: " + id + "\nНазвание: " + title
               + "\nЦвет: " + color + "\nРазмер: " + size;
    }
}
