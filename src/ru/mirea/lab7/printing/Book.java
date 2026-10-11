package ru.mirea.lab7.printing;

import ru.mirea.common.Printable;

public class Book implements Printable {
    private final String title;
    private final String author;
    private final int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override

    public void print() {
        System.out.printf("Книга '%s' (автор %s) была издана в %d году%n", title, author, year);
    }

    public static void printBooks(Printable[] printables) {
        for (Printable publication : printables) {
            if (publication instanceof Book) publication.print();
        }
    }
}
