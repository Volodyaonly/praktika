package ru.mirea.lab2.task07;

public class BookShelf {
    private final Book[] books;
    private int bookCount;
    public BookShelf(int size) {
        books = new Book[size];
        bookCount = 0;
    }
    public void addBook(Book book) {
        if (book != null && bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
        }
    }
    public Book getLatest() {
        if (bookCount == 0) return null;
        Book latest = books[0];
        for (int index = 1; index < bookCount; index++)
            if (books[index].getYear() > latest.getYear()) latest = books[index];
        return latest;
    }
    public Book getEarliest() {
        if (bookCount == 0) return null;
        Book earliest = books[0];
        for (int index = 1; index < bookCount; index++)
            if (books[index].getYear() < earliest.getYear()) earliest = books[index];
        return earliest;
    }
    public void sortByYear() {
        for (int index = 0; index < bookCount - 1; index++)
            for (int indexToCompare = 0; indexToCompare < bookCount - index - 1; indexToCompare++)
                if (books[indexToCompare].getYear() > books[indexToCompare + 1].getYear()) {
                    Book temporaryBook = books[indexToCompare];
                    books[indexToCompare] = books[indexToCompare + 1];
                    books[indexToCompare + 1] = temporaryBook;
                }
    }
    public void printAll() {
        for (int index = 0; index < bookCount; index++) System.out.println(books[index]);
    }
}
