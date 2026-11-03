package ru.mirea.lab11.task05;

import java.util.ArrayList;
import java.util.LinkedList;

// В этой задаче коллекции нужны по условию: сравниваем их скорость.
public class Main {
    public static void main(String[] args) {
        int count = 3000;
        ArrayList<Integer> array = new ArrayList<Integer>();
        LinkedList<Integer> linked = new LinkedList<Integer>();

        long start = System.nanoTime();
        for (int i = 0; i < count; i++) array.add(i);
        System.out.println("ArrayList: добавление " + (System.nanoTime() - start) + " нс");

        start = System.nanoTime();
        for (int i = 0; i < count; i++) linked.add(i);
        System.out.println("LinkedList: добавление " + (System.nanoTime() - start) + " нс");

        start = System.nanoTime();
        array.add(count / 2, -1);
        System.out.println("ArrayList: вставка " + (System.nanoTime() - start) + " нс");

        start = System.nanoTime();
        linked.add(count / 2, -1);
        System.out.println("LinkedList: вставка " + (System.nanoTime() - start) + " нс");

        start = System.nanoTime();
        array.contains(2000);
        System.out.println("ArrayList: поиск " + (System.nanoTime() - start) + " нс");

        start = System.nanoTime();
        linked.contains(2000);
        System.out.println("LinkedList: поиск " + (System.nanoTime() - start) + " нс");

        start = System.nanoTime();
        array.remove(count / 2);
        System.out.println("ArrayList: удаление " + (System.nanoTime() - start) + " нс");

        start = System.nanoTime();
        linked.remove(count / 2);
        System.out.println("LinkedList: удаление " + (System.nanoTime() - start) + " нс");
    }
}
