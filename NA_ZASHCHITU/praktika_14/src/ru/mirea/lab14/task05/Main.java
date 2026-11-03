package ru.mirea.lab14.task05;

import java.util.Scanner;

public class Main {
    public static boolean validDate(String text) {
        if (!text.matches("\\d{2}/\\d{2}/\\d{4}")) return false;
        int day = Integer.parseInt(text.substring(0, 2));
        int month = Integer.parseInt(text.substring(3, 5));
        int year = Integer.parseInt(text.substring(6, 10));
        if (year < 1900 || month < 1 || month > 12) return false;

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        boolean leap = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
        if (leap) days[1] = 29;
        return day >= 1 && day <= days[month - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(validDate(sc.nextLine()));
    }
}
