package ru.mirea.lab14.task04;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        // Находим цифру, за которой нет знака + (включая пробелы перед знаком).
        boolean result = Pattern.compile("\\d(?!\\s*\\+)").matcher(text).find();
        System.out.println(result);
    }
}
