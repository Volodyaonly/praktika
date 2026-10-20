package ru.mirea.lab2.task10;

import java.util.Scanner;

/** Практика 2, задание 10: количество слов. */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        if (!scanner.hasNextLine()) {
            System.out.println("Ввод завершён");
            return;
        }
        String line = scanner.nextLine().trim();
        int wordCount = line.isEmpty() ? 0 : line.split("\\s+").length;
        System.out.println("Слов: " + wordCount);
    }
}
