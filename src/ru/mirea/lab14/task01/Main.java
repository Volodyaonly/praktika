package ru.mirea.lab14.task01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String text = sc.nextLine();
        // Разделяем по пробелам, запятым, точкам и точкам с запятой.
        String[] parts = text.split("[\\s,.;]+");
        for (int i = 0; i < parts.length; i++) {
            if (!parts[i].isEmpty()) System.out.println(parts[i]);
        }
    }
}
