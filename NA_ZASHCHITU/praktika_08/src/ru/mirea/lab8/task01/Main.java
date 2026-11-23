package ru.mirea.lab8.task01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = 1;
        int left = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(number + " ");
            left--;
            if (left == 0) {
                number++;
                left = number;
            }
        }
        System.out.println();
    }
}
