package ru.mirea.lab3.random.task04;

import java.util.Random;
import java.util.Scanner;

/** Практика 3: выбор чётных чисел. */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length;
        while (true) {
            System.out.print("Введите натуральное число n > 0: ");
            if (!scanner.hasNext()) {
                System.out.println("Ввод завершён");
                return;
            }
            if (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Ошибка: введите целое число");
                continue;
            }
            length = scanner.nextInt();
            if (length > 0) {
                break;
            }
            System.out.println("Ошибка: число должно быть больше нуля");
        }

        Random random = new Random();
        int[] values = new int[length];
        for (int i = 0; i < length; i++) {
            values[i] = (int) random.nextLong((long) length + 1);
        }
        System.out.print("Исходный массив: ");
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println();

        int evenCount = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                evenCount++;
            }
        }

        int[] evenValues = new int[evenCount];
        int nextIndex = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                evenValues[nextIndex] = values[i];
                nextIndex++;
            }
        }
        System.out.print("Массив чётных: ");
        for (int i = 0; i < evenValues.length; i++) {
            System.out.print(evenValues[i] + " ");
        }
        System.out.println();
    }
}
