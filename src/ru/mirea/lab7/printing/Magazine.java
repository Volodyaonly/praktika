package ru.mirea.lab7.printing;

import ru.mirea.common.Printable;

public class Magazine implements Printable {
    private final String name;

    public Magazine(String name) {
        this.name = name;
    }

    @Override

    public void print() {
        System.out.println("Журнал '" + name + "'");
    }

    public static void printMagazines(Printable[] printables) {
        for (Printable publication : printables) {
            if (publication instanceof Magazine) publication.print();
        }
    }
}
