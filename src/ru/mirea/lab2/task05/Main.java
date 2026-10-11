package ru.mirea.lab2.task05;

/** Практика 2, задание 5: Возраст собаки. */
public class Main {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog("Шарик", 3);
        dogs[1] = new Dog("Бобик", 5);
        dogs[2] = new Dog("Рекс", 2);
        for (Dog dog : dogs) System.out.println(dog);
    }
}
