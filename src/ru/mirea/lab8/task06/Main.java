package ru.mirea.lab8.task06;

import java.util.Scanner;

public class Main {
    public static boolean isPrime(int n, int divisor) {
        if (divisor > n / divisor) return true;
        if (n % divisor == 0) return false;
        return isPrime(n, divisor + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n > 1 && isPrime(n, 2) ? "YES" : "NO");
    }
}
