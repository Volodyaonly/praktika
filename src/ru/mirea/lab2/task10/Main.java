package ru.mirea.lab2.task10;

import java.util.Scanner;
import ru.mirea.common.ConsoleInput;

/** Практика 2, задание 10: количество слов. */
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String line = ConsoleInput.readLine(scanner, "Введите строку: ").trim();
            int wordCount = line.isEmpty() ? 0 : line.split("\\s+").length;
            System.out.println("Слов: " + wordCount);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
