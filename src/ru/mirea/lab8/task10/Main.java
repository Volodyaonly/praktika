package ru.mirea.lab8.task10;

import java.util.Scanner;

public class Main {
    public static long reverse(long n, long answer) {
        if (n == 0) return answer;
        return reverse(n / 10, answer * 10 + n % 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(reverse(n, 0));
    }
}
