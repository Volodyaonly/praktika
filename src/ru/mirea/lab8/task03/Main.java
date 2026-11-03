package ru.mirea.lab8.task03;

import java.util.Scanner;

public class Main {
    public static void printRange(int a, int b) {
        System.out.print(a + " ");
        if (a == b) return;
        if (a < b) printRange(a + 1, b);
        else printRange(a - 1, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        printRange(a, b);
        System.out.println();
    }
}
