package ru.mirea.lab11.task01;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите дату получения задания: ");
        String received = sc.nextLine();
        Date submitted = new Date();

        System.out.println("Разработчик: Овсянников");
        System.out.println("Дата получения: " + received);
        System.out.println("Дата и время сдачи: " + submitted);
    }
}
