package ru.mirea.lab14.task06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        // Учебная проверка распространённых адресов, включая root@localhost.
        String regex = "[A-Za-z0-9_%+-]+(\\.[A-Za-z0-9_%+-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*";
        System.out.println(email.matches(regex));
    }
}
