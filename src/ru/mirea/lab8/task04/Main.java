package ru.mirea.lab8.task04;

import java.util.Scanner;

public class Main {
    // В условии сумма названа и s, и d. Используем s.
    public static long count(int digits, int sum, boolean first) {
        if (digits == 0) return sum == 0 ? 1 : 0;
        long answer = 0;
        int start = first ? 1 : 0;
        for (int digit = start; digit <= 9 && digit <= sum; digit++) {
            answer += count(digits - 1, sum - digit, false);
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int s = sc.nextInt();
        System.out.println(count(k, s, true));
    }
}
