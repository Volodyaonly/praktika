package ru.mirea.lab2.task08;

import java.util.Scanner;

/** Практика 2, задание 8: обратный порядок строк. */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length;
        while (true) {
            System.out.print("Введите количество строк: ");
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
            if (length >= 0) {
                break;
            }
            System.out.println("Ошибка: количество строк не может быть отрицательным");
        }
        scanner.nextLine();

        String[] values = new String[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            if (!scanner.hasNextLine()) {
                System.out.println("Ввод завершён");
                return;
            }
            values[i] = scanner.nextLine();
        }

        String[] reversed = new String[length];
        for (int i = 0; i < length; i++) {
            reversed[i] = values[length - 1 - i];
        }

        System.out.println("Исходный массив: ");
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println("\nОбратный массив: ");
        for (int i = 0; i < reversed.length; i++) {
            System.out.print(reversed[i] + " ");
        }
        System.out.println();
    }
}
