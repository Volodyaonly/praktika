package ru.mirea.lab3.random.task03;

import java.util.Random;

/** Практика 3: Строго возрастающий массив. */
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] values = new int[4];
        for (int index = 0; index < 4; index++) values[index] = 10 + random.nextInt(90);
        System.out.print("Массив: ");
        for (int value : values) System.out.print(value + " ");
        System.out.println();
        boolean increasing = true;
        for (int index = 0; index < values.length - 1; index++) {
            if (values[index] >= values[index + 1]) {
                increasing = false;
                break;
            }
        }
        System.out.println(increasing ? "Массив строго возрастающий" : "Массив НЕ строго возрастающий");
    }
}
