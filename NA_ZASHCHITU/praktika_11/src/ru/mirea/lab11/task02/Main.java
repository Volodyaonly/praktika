package ru.mirea.lab11.task02;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите год, месяц и день: ");
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day, 0, 0, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        Date entered = calendar.getTime();
        Date now = new Date();

        System.out.println("Введённая дата: " + entered);
        System.out.println("Текущая дата: " + now);
        if (entered.before(now)) System.out.println("Введённая дата раньше текущей");
        else if (entered.after(now)) System.out.println("Введённая дата позже текущей");
        else System.out.println("Даты равны");
    }
}
