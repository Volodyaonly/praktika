package ru.mirea.lab9.task04;

import ru.mirea.lab9.Student;

public class Main {
    public static void main(String[] args) {
        Student first = new Student(10, "Анна", 5.0);
        Student second = new Student(20, "Иван", 4.5);
        // Student самостоятельно реализует Comparable и метод compareTo.
        System.out.println("Результат сравнения: " + first.compareTo(second));
        System.out.println(first);
        System.out.println(second);
    }
}
