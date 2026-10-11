package ru.mirea.lab1.task01;

/** Практика 1: сумма и среднее массива. */
public class Main {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        long sum = 0;
        for (int value : values) {
            sum += value;
        }
        double average = (double) sum / values.length;
        System.out.println("Сумма: " + sum);
        System.out.println("Среднее: " + average);
    }
}
