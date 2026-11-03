package ru.mirea.lab8.task07;

import java.util.Scanner;

public class Main {
    public static void factors(int n, int divisor) {
        if (n == 1) return;
        if (divisor > n / divisor) {
            System.out.print(n + " ");
        } else if (n % divisor == 0) {
            System.out.print(divisor + " ");
            factors(n / divisor, divisor);
        } else {
            factors(n, divisor + 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 1) factors(n, 2);
        System.out.println();
    }
}
