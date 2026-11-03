package ru.mirea.lab14.task02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println(text.matches("abcdefghijklmnopqrstuv18340"));
    }
}
