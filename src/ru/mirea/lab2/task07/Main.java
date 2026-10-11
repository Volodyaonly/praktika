package ru.mirea.lab2.task07;

/** Практика 2, задание 7: Книжная полка. */
public class Main {
    public static void main(String[] args) {
        BookShelf shelf = new BookShelf(5);
        shelf.addBook(new Book("Толстой", "Война и мир", 1863));
        shelf.addBook(new Book("Тургенев", "Отцы и дети", 1862));
        shelf.addBook(new Book("Достоевский", "Преступление и наказание", 1866));
        shelf.addBook(new Book("Пушкин", "Евгений Онегин", 1833));
        System.out.println("Все книги:");
        shelf.printAll();
        System.out.println("Самая поздняя: " + shelf.getLatest());
        System.out.println("Самая ранняя: " + shelf.getEarliest());
        shelf.sortByYear();
        System.out.println("После сортировки по году:");
        shelf.printAll();
    }
}
