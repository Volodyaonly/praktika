package ru.mirea.lab2.task08;

import java.util.Scanner;
import ru.mirea.common.ConsoleInput;

/** Практика 2, задание 8: обратный порядок строк. */
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int length = ConsoleInput.readInt(scanner, "Введите количество строк: ", 0, Integer.MAX_VALUE);
            if (scanner.hasNextLine()) {
                scanner.nextLine(); // Убираем конец строки после числа.
            }
            String[] values = new String[length];
            for (int index = 0; index < length; index++) {
                values[index] = ConsoleInput.readLine(scanner, "Строка " + (index + 1) + ": ");
            }
            String[] reversed = new String[length];
            for (int index = 0; index < length; index++) {
                reversed[index] = values[length - 1 - index];
            }
            System.out.println("Исходный массив: ");
            for (String value : values) {
                System.out.print(value + " ");
            }
            System.out.println("\nОбратный массив: ");
            for (String value : reversed) {
                System.out.print(value + " ");
            }
            System.out.println();
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
