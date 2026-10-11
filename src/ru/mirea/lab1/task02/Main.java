package ru.mirea.lab1.task02;

import java.util.Scanner;
import ru.mirea.common.ConsoleInput;

/** Практика 1: сумма, минимум и максимум массива. */
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int length = ConsoleInput.readInt(scanner, "Введите длину массива: ", 1, Integer.MAX_VALUE);
            int[] values = new int[length];
            for (int index = 0; index < values.length; index++) {
                values[index] = ConsoleInput.readInt(scanner, "Введите элемент " + index + ": ");
            }

            long sum = 0;
            int index = 0;
            while (index < values.length) {
                sum += values[index];
                index++;
            }

            // Начинаем с реального элемента: массив может содержать только отрицательные числа.
            int minimum = values[0];
            int maximum = values[0];
            index = 0;
            do {
                minimum = Math.min(minimum, values[index]);
                maximum = Math.max(maximum, values[index]);
                index++;
            } while (index < values.length);

            System.out.println("Сумма: " + sum);
            System.out.println("Максимум: " + maximum);
            System.out.println("Минимум: " + minimum);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
