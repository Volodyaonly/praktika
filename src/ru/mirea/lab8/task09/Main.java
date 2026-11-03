package ru.mirea.lab8.task09;

import java.util.Scanner;

public class Main {
    // Выбираем a мест для нулей из b + 1 промежутков.
    public static long combinations(int n, int k) {
        if (k == 0 || k == n) return 1;
        return combinations(n - 1, k - 1) + combinations(n - 1, k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a < 0 || b < 0 || a > b + 1) System.out.println(0);
        else System.out.println(combinations(b + 1, a));
    }
}
