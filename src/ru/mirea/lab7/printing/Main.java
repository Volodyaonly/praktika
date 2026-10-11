package ru.mirea.lab7.printing;

import ru.mirea.common.Printable;

/** Практика 7: Печать книг и журналов. */
public class Main {
    public static void main(String[] args) {
        Printable[] printables = {
                new Book("Война и мир", "Л. Н. Толстой", 1863),
                new Magazine("Хакер"),
                new Book("Отцы и дети", "И. С. Тургенев", 1862),
                new Magazine("Наука и жизнь"),
                new Book("Преступление и наказание", "Ф. М. Достоевский", 1866)
        };

        System.out.println("Все издания:");
        for (Printable publication : printables) publication.print();

        System.out.println("\nТолько журналы:");
        Magazine.printMagazines(printables);

        System.out.println("\nТолько книги:");
        Book.printBooks(printables);
    }
}
