package ru.mirea.lab3.random.task04;

import java.util.Random;
import java.util.Scanner;
import ru.mirea.common.ConsoleInput;

/** Практика 3: выбор чётных чисел. */
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int length = ConsoleInput.readInt(scanner, "Введите натуральное число n > 0: ", 1, Integer.MAX_VALUE);
            Random random = new Random();
            int[] values = new int[length];
            for (int index = 0; index < length; index++) {
                values[index] = (int) random.nextLong((long) length + 1);
            }
            System.out.print("Исходный массив: ");
            for (int value : values) {
                System.out.print(value + " ");
            }
            System.out.println();

            int evenCount = 0;
            for (int value : values) {
                if (value % 2 == 0) {
                    evenCount++;
                }
            }
            int[] evenValues = new int[evenCount];
            int nextEvenIndex = 0;
            for (int value : values) {
                if (value % 2 == 0) {
                    evenValues[nextEvenIndex++] = value;
                }
            }
            System.out.print("Массив чётных: ");
            for (int value : evenValues) {
                System.out.print(value + " ");
            }
            System.out.println();
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
