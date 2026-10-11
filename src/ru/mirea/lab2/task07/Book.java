package ru.mirea.lab2.task07;

public class Book {
    private final String author;
    private final String title;
    private final int year;
    public Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }
    public int getYear() {
        return year;
    }
    @Override
    public String toString() {
        return "Book{author='" + author + "', title='" + title + "', year=" + year + "}";
    }
}
