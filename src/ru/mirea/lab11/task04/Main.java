package ru.mirea.lab11.task04;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Год, месяц, день: ");
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();
        System.out.print("Часы и минуты: ");
        int hour = sc.nextInt();
        int minute = sc.nextInt();

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day, hour, minute, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        Date date = calendar.getTime();

        System.out.println("Calendar: " + calendar.getTime());
        System.out.println("Date: " + date);
    }
}
