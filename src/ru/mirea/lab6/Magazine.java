package ru.mirea.lab6;

import ru.mirea.common.Printable;

public class Magazine implements Printable {
    private final String name;
    public Magazine(String name) {
        this.name = name;
    }
    @Override
    public void print() {
        System.out.println("Журнал: " + name);
    }
    public static void printMagazines(Printable[] printables) {
        for (Printable item : printables) {
            if (item instanceof Magazine) item.print();
        }
    }
}
