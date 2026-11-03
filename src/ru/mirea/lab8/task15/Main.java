package ru.mirea.lab8.task15;

import java.util.Scanner;

public class Main {
    public static void printDigits(int n) {
        System.out.print(n % 10 + " ");
        if (n >= 10) printDigits(n / 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDigits(n);
        System.out.println();
    }
}
