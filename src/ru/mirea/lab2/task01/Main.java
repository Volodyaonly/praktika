package ru.mirea.lab2.task01;

/** Практика 2, задание 1: Автор книги. */
public class Main {
    public static void main(String[] args) {
        Author firstAuthor = new Author("Иван Петров", "ivan@mail.ru", 'm');
        Author secondAuthor = new Author("Анна Сидорова", "anna@mail.ru", 'f');
        System.out.println(firstAuthor);
        System.out.println(secondAuthor);
        firstAuthor.setEmail("new_ivan@mail.ru");
        System.out.println("После смены email: " + firstAuthor);
    }
}
