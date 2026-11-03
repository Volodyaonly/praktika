package ru.mirea.lab13.task02;

public class Main {
    public static void main(String[] args) {
        Person first = new Person("Петров", "Иван", "Сергеевич");
        Person second = new Person("Иванова", "Анна", "");
        Person third = new Person("Сидоров", "", "");
        System.out.println(first.shortName());
        System.out.println(second.shortName());
        System.out.println(third.shortName());
    }
}
