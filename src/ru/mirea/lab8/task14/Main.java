package ru.mirea.lab8.task14;

import java.util.Scanner;

public class Main {
    public static void printDigits(int n) {
        if (n >= 10) printDigits(n / 10);
        System.out.print(n % 10 + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDigits(n);
        System.out.println();
    }
}
