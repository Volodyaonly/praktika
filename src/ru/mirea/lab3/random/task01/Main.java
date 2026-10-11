package ru.mirea.lab3.random.task01;

import java.util.Arrays;
import java.util.Random;

/** Практика 3: Случайные массивы и сортировка. */
public class Main {
    public static void main(String[] args) {
        int arraySize = 10;
        double[] mathValues = new double[arraySize];
        for (int index = 0; index < arraySize; index++) mathValues[index] = Math.random() * 100;
        System.out.println("Math.random() до сортировки: " + Arrays.toString(mathValues));
        Arrays.sort(mathValues);
        System.out.println("Math.random() после сортировки: " + Arrays.toString(mathValues));
        Random random = new Random();
        double[] randomValues = new double[arraySize];
        for (int index = 0; index < arraySize; index++) randomValues[index] = random.nextDouble() * 100;
        System.out.println("Random до сортировки: " + Arrays.toString(randomValues));
        Arrays.sort(randomValues);
        System.out.println("Random после сортировки: " + Arrays.toString(randomValues));
    }
}
